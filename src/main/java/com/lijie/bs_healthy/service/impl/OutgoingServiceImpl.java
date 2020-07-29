package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.mapper.OutgoingInfoMapper;
import com.lijie.bs_healthy.model.OutgoingInfo;
import com.lijie.bs_healthy.service.OutgoingService;
import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutgoingServiceImpl implements OutgoingService {

    @Autowired
    private OutgoingInfoMapper outgoingInfoMapper;

    @Override
    public List<OutgoingInfo> list() {
        return outgoingInfoMapper.selectAll(new OutgoingInfo());
    }

    @Override
    public void add(OutgoingInfo outgoingInfo) {
        outgoingInfoMapper.insert(outgoingInfo);
    }

    @Override
    public void del(Integer id) {
        outgoingInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OutgoingInfo getById(Integer id) {
        return outgoingInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(OutgoingInfo outgoingInfo) {
        outgoingInfoMapper.updateByPrimaryKey(outgoingInfo);
    }

    @Override
    public PageInfo queryAll(Integer currPage, OutgoingInfo outgoingInfo) {
        if (currPage == null) currPage=1;
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<OutgoingInfo> pageInfo = new PageInfo<>(outgoingInfoMapper.selectAll(outgoingInfo));
        return pageInfo;
    }
}
