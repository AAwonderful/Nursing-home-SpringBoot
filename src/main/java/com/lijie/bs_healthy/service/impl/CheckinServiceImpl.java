package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.mapper.CheckinInfoMapper;
import com.lijie.bs_healthy.model.CheckinInfo;
import com.lijie.bs_healthy.service.CheckinService;
import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckinServiceImpl implements CheckinService {

    @Autowired
    private CheckinInfoMapper checkinInfoMapper;

    @Override
    public List<CheckinInfo> list() {
        return checkinInfoMapper.selectAll(new CheckinInfo());
    }

    @Override
    public void add(CheckinInfo checkinInfo) {
        checkinInfoMapper.insert(checkinInfo);
    }

    @Override
    public void del(Integer id) {
        checkinInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CheckinInfo getById(Integer id) {
        return checkinInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(CheckinInfo checkinInfo) {
        checkinInfoMapper.updateByPrimaryKey(checkinInfo);
    }

    @Override
    public PageInfo queryAll(Integer currPage, CheckinInfo checkinInfo) {
        //如果当前页没值默认第一页
        if (currPage == null) currPage=1;
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<CheckinInfo> pageInfo = new PageInfo<>(checkinInfoMapper.selectAll(checkinInfo));
        return pageInfo;
    }
}
