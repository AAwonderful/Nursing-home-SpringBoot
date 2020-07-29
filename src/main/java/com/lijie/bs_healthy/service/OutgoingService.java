package com.lijie.bs_healthy.service;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.OutgoingInfo;


import java.util.List;

public interface OutgoingService {

    List<OutgoingInfo> list();

    void add(OutgoingInfo outgoingInfo);

    void del(Integer id);

    OutgoingInfo getById(Integer id);

    void update(OutgoingInfo outgoingInfo);

    PageInfo queryAll(Integer currPage, OutgoingInfo outgoingInfo);
}
