package com.lijie.bs_healthy.controller;


import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.model.OutgoingInfo;
import com.lijie.bs_healthy.service.OutgoingService;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/outgoing")
public class OutgoingController {

    @Resource
    private OutgoingService outgoingService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<OutgoingInfo> list(@PathVariable Integer currPage, @RequestBody OutgoingInfo outgoingInfo){
        System.out.println(outgoingInfo.toString());
        return outgoingService.queryAll(currPage,outgoingInfo);
    }

    @RequestMapping("list")
    public List<OutgoingInfo> list(){
        return outgoingService.list();
    }

    /**
     *
     * @param outgoingInfo
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody OutgoingInfo outgoingInfo){
        System.out.println(outgoingInfo.toString());
        outgoingService.add(outgoingInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id) {
        System.out.println(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        outgoingService.del(id);
        return resultVO;
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("get/{id}")
    public OutgoingInfo get(@PathVariable Integer id){
        return  outgoingService.getById(id);
    }

    /**
     * 修改
     * @param outgoingInfo
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody OutgoingInfo outgoingInfo){
        System.out.println("修改"+outgoingInfo.toString());
        outgoingService.update(outgoingInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

}
