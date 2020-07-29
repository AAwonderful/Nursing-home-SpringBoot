package com.lijie.bs_healthy.service;




import com.lijie.bs_healthy.model.BedInfo;

import java.util.List;

public interface BedService {
    List<BedInfo> list();

    List<BedInfo> listbystate();

    BedInfo getById(Integer id);

    void update(BedInfo bedInfo);
}
