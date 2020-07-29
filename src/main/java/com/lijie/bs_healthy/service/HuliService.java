package com.lijie.bs_healthy.service;


import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.HuliInfo;


import java.util.List;

public interface HuliService {
    public List<HuliInfo> list();
    PageInfo<HuliInfo> queryAll(Integer currPage, HuliInfo huliInfo);
    void del(Integer id);
    void add(HuliInfo huliInfo);
    void update(HuliInfo huliInfo);
    HuliInfo selByid(Integer id);
}
