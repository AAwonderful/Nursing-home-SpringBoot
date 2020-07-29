package com.lijie.bs_healthy.service;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.CheckoutInfo;


import java.util.List;

public interface CheckoutService {
    List<CheckoutInfo> list();

    void add(CheckoutInfo checkoutInfo);

    void del(Integer id);

    CheckoutInfo getById(Integer id);

    void update(CheckoutInfo checkoutInfo);

    PageInfo queryAll(Integer currPage, CheckoutInfo checkoutInfo);
}
