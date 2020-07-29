package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.mapper.NurseInfoMapper;
import com.lijie.bs_healthy.model.NurseInfo;
import com.lijie.bs_healthy.service.NurseService;

import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NurseServiceImpl implements NurseService {

    @Autowired
    private NurseInfoMapper nurseInfoMapper;


    @Override
    public boolean login(NurseInfo nurseInfo) {
        boolean flag = true;
        NurseInfo u = nurseInfoMapper.selectByname(nurseInfo);
        if(u==null) flag = false;
        return flag;
    }

    @Override
    public PageInfo<NurseInfo> selectALL(Integer currPage) {
        if (currPage==null){
            currPage=1;
        }
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<NurseInfo> pageInfo=new PageInfo<>(nurseInfoMapper.selectAll());
        return  pageInfo;
    }

    @Override
    public PageInfo<NurseInfo> queryAll(Integer currPage, NurseInfo nurseInfo) {
        if (currPage==null){
            currPage=1;
        }
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<NurseInfo> pageInfo=new PageInfo<>(nurseInfoMapper.queryAll(nurseInfo));
        return  pageInfo;
    }

    @Override
    public void del(Integer id) {
        nurseInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(NurseInfo nurseInfo) {
        nurseInfo.setCreateTime(new Date());
        nurseInfoMapper.insert(nurseInfo);
    }

    @Override
    public void update(NurseInfo nurseInfo) {
        nurseInfo.setUpdateTime(new Date());
        nurseInfoMapper.updateByPrimaryKey(nurseInfo);
    }

    @Override
    public NurseInfo selByid(Integer id) {
        return nurseInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<NurseInfo> list() {
        return nurseInfoMapper.selectAll();
    }
}
