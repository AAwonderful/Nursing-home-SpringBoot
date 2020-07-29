package com.lijie.bs_healthy.controller;

import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.model.CheckoutInfo;
import com.lijie.bs_healthy.service.CheckoutService;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
    @Resource
    private CheckoutService checkoutService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<CheckoutInfo> list(@PathVariable Integer currPage, @RequestBody CheckoutInfo checkoutInfo){
        System.out.println(checkoutInfo.toString());
        return checkoutService.queryAll(currPage,checkoutInfo);
    }

    @RequestMapping("list")
    public List<CheckoutInfo> list(){
        return checkoutService.list();
    }

    /**
     *
     * @param checkoutInfo
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody CheckoutInfo checkoutInfo){
        System.out.println(checkoutInfo.toString());
        checkoutService.add(checkoutInfo);
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
        checkoutService.del(id);
        return resultVO;
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("get/{id}")
    public CheckoutInfo get(@PathVariable Integer id){
        return  checkoutService.getById(id);
    }

    /**
     * 修改
     * @param checkoutInfo
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody CheckoutInfo checkoutInfo){
        System.out.println("修改"+checkoutInfo.toString());
        checkoutService.update(checkoutInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }
}
