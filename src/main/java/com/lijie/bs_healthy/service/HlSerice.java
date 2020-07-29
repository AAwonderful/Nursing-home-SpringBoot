package com.lijie.bs_healthy.service;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.HuliServiceInfo;


import java.util.List;

public interface HlSerice {
    public List<HuliServiceInfo> list();
    public HuliServiceInfo selByid(Integer id);
    PageInfo<HuliServiceInfo> queryAll(Integer currPage, HuliServiceInfo huliServiceInfo);
    void del(Integer id);
    void add(HuliServiceInfo huliServiceInfo);
    void update(HuliServiceInfo huliServiceInfo);
}
