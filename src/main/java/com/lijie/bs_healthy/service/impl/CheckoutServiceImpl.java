package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.mapper.CheckoutInfoMapper;
import com.lijie.bs_healthy.model.CheckoutInfo;
import com.lijie.bs_healthy.service.CheckoutService;
import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private CheckoutInfoMapper checkoutInfoMapper;

    @Override
    public List<CheckoutInfo> list() {
        return checkoutInfoMapper.selectAll(new CheckoutInfo());
    }

    @Override
    public void add(CheckoutInfo checkoutInfo) {
        checkoutInfoMapper.insert(checkoutInfo);
    }

    @Override
    public void del(Integer id) {
        checkoutInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CheckoutInfo getById(Integer id) {
        return checkoutInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(CheckoutInfo checkoutInfo) {
        checkoutInfoMapper.updateByPrimaryKey(checkoutInfo);
    }

    @Override
    public PageInfo queryAll(Integer currPage, CheckoutInfo checkoutInfo) {
        //如果当前页没值默认第一页
        if (currPage == null) currPage=1;
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<CheckoutInfo> pageInfo = new PageInfo<>(checkoutInfoMapper.selectAll(checkoutInfo));
        return pageInfo;
    }
}
