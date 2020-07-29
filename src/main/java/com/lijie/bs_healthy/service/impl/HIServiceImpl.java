package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.mapper.HuliServiceInfoMapper;
import com.lijie.bs_healthy.model.HuliServiceInfo;
import com.lijie.bs_healthy.service.HlSerice;
import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HIServiceImpl implements HlSerice {
    @Autowired
    private HuliServiceInfoMapper huliServiceInfoMapper;

    @Override
    public List<HuliServiceInfo> list() {
        return huliServiceInfoMapper.selectAll();
    }

    @Override
    public HuliServiceInfo selByid(Integer id) {
        return huliServiceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<HuliServiceInfo> queryAll(Integer currPage, HuliServiceInfo huliServiceInfo) {
        if (currPage == null) {
            currPage = 1;
        }
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<HuliServiceInfo> pageInfo = new PageInfo<>(huliServiceInfoMapper.queryAll(huliServiceInfo));
        return pageInfo;
    }
    @Override
    public void del(Integer id) {
        huliServiceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(HuliServiceInfo huliServiceInfo) {
        huliServiceInfoMapper.insert(huliServiceInfo);
    }

    @Override
    public void update(HuliServiceInfo huliServiceInfo) {
        huliServiceInfoMapper.updateByPrimaryKey(huliServiceInfo);
    }
}
