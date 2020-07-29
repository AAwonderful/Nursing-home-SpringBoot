package com.lijie.bs_healthy.service;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.CheckinInfo;


import java.util.List;

public interface CheckinService {

    List<CheckinInfo> list();

    void add(CheckinInfo checkinInfo);

    void del(Integer id);

    CheckinInfo getById(Integer id);

    void update(CheckinInfo checkinInfo);

    PageInfo queryAll(Integer currPage, CheckinInfo checkinInfo);
}
