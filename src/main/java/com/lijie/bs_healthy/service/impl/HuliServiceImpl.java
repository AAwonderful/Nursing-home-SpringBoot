package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.mapper.HuliInfoMapper;
import com.lijie.bs_healthy.model.HuliInfo;
import com.lijie.bs_healthy.service.HuliService;
import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HuliServiceImpl implements HuliService {

    @Autowired
    private HuliInfoMapper huliInfoMapper;

    @Override
    public List<HuliInfo> list() {
        return huliInfoMapper.selectAll();
    }

    @Override
    public PageInfo<HuliInfo> queryAll(Integer currPage, HuliInfo huliInfo) {
        if (currPage==null){
            currPage=1;
        }
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<HuliInfo> pageInfo=new PageInfo<>(huliInfoMapper.queryAll(huliInfo));
        return  pageInfo;
    }

    @Override
    public void del(Integer id) {
        huliInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(HuliInfo huliInfo) {
        huliInfo.setCreateTime(new Date());
        huliInfo.setUpdateTime(new Date());
        huliInfo.setType(0);
        huliInfoMapper.insert(huliInfo);
    }

    @Override
    public void update(HuliInfo huliInfo) {
        huliInfo.setUpdateTime(new Date());
        huliInfoMapper.updateByPrimaryKey(huliInfo);
    }

    @Override
    public HuliInfo selByid(Integer id) {
        return huliInfoMapper.selectByPrimaryKey(id);
    }
}
