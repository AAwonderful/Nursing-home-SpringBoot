package com.lijie.bs_healthy.controller;


import com.lijie.bs_healthy.model.BedInfo;
import com.lijie.bs_healthy.service.BedService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bed")
public class BedController {

    @Resource
    private BedService bedService;

    @RequestMapping("list")
    public List<BedInfo> list(){
        return bedService.list();
    }

    @RequestMapping("listbystate")
    public List<BedInfo> listbystate(){
        return bedService.listbystate();
    }
}
