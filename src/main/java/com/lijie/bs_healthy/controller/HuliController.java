package com.lijie.bs_healthy.controller;

import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.model.HuliInfo;
import com.lijie.bs_healthy.service.HuliService;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/huli")
public class HuliController {

    @Resource
    private HuliService huliService;

    @RequestMapping("listall")
    List<HuliInfo>listall(){
        return  huliService.list();
    }

    @RequestMapping("query/{currPage}")
    public PageInfo<HuliInfo> query(@PathVariable Integer currPage, @RequestBody HuliInfo huliInfo){
        return huliService.queryAll(currPage,huliInfo);
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        huliService.del(id);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }
    @RequestMapping("add")
    public ResultVO add(@RequestBody HuliInfo huliInfo){
        huliService.add(huliInfo);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }
    @RequestMapping("update")
    public ResultVO update(@RequestBody HuliInfo huliInfo){
        huliService.update(huliInfo);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("get/{id}")
    public HuliInfo get(@PathVariable Integer id){
        HuliInfo huliInfo=huliService.selByid(id);
        System.out.println(huliInfo.toString());
        return huliInfo;
    }
}
