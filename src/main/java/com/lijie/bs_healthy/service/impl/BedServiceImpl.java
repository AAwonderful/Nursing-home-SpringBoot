package com.lijie.bs_healthy.service.impl;


import com.lijie.bs_healthy.mapper.BedInfoMapper;
import com.lijie.bs_healthy.model.BedInfo;
import com.lijie.bs_healthy.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService {
    @Autowired
    private BedInfoMapper bedInfoMapper;

    @Override
    public List<BedInfo> list() {
        return bedInfoMapper.selectAll(new BedInfo());
    }

    @Override
    public List<BedInfo> listbystate() {
        return bedInfoMapper.selectByState(new BedInfo());
    }

    @Override
    public BedInfo getById(Integer id) {
        return bedInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(BedInfo bedInfo) {
        bedInfoMapper.updateByPrimaryKey(bedInfo);
    }

}
