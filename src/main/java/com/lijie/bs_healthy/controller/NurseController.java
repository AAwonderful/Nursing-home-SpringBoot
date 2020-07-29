package com.lijie.bs_healthy.controller;

import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.model.NurseInfo;
import com.lijie.bs_healthy.service.NurseService;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    @Resource
    private NurseService nurseService;


    @RequestMapping("/login")
    public ResultVO login(@RequestBody NurseInfo nurseInfo){
        int code = nurseService.login(nurseInfo) ? 200 : 201;
        ResultVO resultVO;
        if (code==200){
            resultVO = new ResultVO(code,"登录成功");
        }
        else{
            resultVO = new ResultVO(code,"登录失败");
        }
       return  resultVO;
    }

    @RequestMapping("listall")
    public List<NurseInfo>listall(){
        return  nurseService.list();
    }
    @RequestMapping("list/{currPage}")
    public PageInfo<NurseInfo> selectall(@PathVariable Integer currPage){
        return nurseService.selectALL(currPage);
    }


    @RequestMapping("query/{currPage}")
    public PageInfo<NurseInfo> query(@PathVariable Integer currPage, @RequestBody NurseInfo nurseInfo){
        return nurseService.queryAll(currPage,nurseInfo);
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nurseService.del(id);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }
    @RequestMapping("add")
    public ResultVO add(@RequestBody NurseInfo nurseInfo){
        nurseService.add(nurseInfo);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }
    @RequestMapping("update")
    public ResultVO update(@RequestBody NurseInfo nurseInfo){
        nurseService.update(nurseInfo);
        ResultVO resultVO=new ResultVO(200,"操作成功");
        return resultVO;
    }

    @RequestMapping("get/{id}")
    public NurseInfo get(@PathVariable Integer id){
        NurseInfo nurseInfo=nurseService.selByid(id);
        System.out.println(nurseInfo.toString());
        return nurseInfo;
    }
}
