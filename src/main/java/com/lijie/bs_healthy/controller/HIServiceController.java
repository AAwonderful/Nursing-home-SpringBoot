package com.lijie.bs_healthy.controller;


import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.model.HuliServiceInfo;
import com.lijie.bs_healthy.service.HlSerice;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hlservice")
public class HIServiceController {

    @Resource
    private HlSerice hlSerice;

    @RequestMapping("listall")
    List<HuliServiceInfo> listall(){
        return  hlSerice.list();
    }

    @RequestMapping("query/{currPage}")
    public PageInfo<HuliServiceInfo> query(@PathVariable Integer currPage, @RequestBody HuliServiceInfo huliServiceInfo){
        return hlSerice.queryAll(currPage,huliServiceInfo);
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        hlSerice.del(id);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }
    @RequestMapping("add")
    public ResultVO add(@RequestBody HuliServiceInfo huliServiceInfo){
        hlSerice.add(huliServiceInfo);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }
    @RequestMapping("update")
    public ResultVO update(@RequestBody HuliServiceInfo huliServiceInfo){
        hlSerice.update(huliServiceInfo);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("get/{id}")
    public HuliServiceInfo get(@PathVariable Integer id){
        HuliServiceInfo huliServiceInfo=hlSerice.selByid(id);
        System.out.println(huliServiceInfo.toString());
        return huliServiceInfo;
    }
}
