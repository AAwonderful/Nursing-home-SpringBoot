package com.lijie.bs_healthy.service;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.NurseInfo;


import java.util.List;

public interface NurseService {
    public boolean login(NurseInfo nurseInfo);
    PageInfo<NurseInfo> selectALL(Integer currPage);
    PageInfo<NurseInfo> queryAll(Integer currPage, NurseInfo nurseInfo);
    void del(Integer id);
    void add(NurseInfo nurseInfo);
    void update(NurseInfo nurseInfo);
    NurseInfo selByid(Integer id);
    public List<NurseInfo> list();
}
