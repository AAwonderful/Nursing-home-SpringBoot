package com.lijie.bs_healthy.controller;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.FoodInfo;
import com.lijie.bs_healthy.service.FoodService;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiJie
 * @date 2020/6/15-10:48
 */
@RestController
@RequestMapping("food")
public class FoodController {
    @Resource
    FoodService foodService;

    /**
     * 分页查询
     * @param currPage
     * @param foodInfo
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo query(@PathVariable Integer currPage, @RequestBody FoodInfo foodInfo){
        System.out.println(foodInfo);
        return foodService.query(currPage,foodInfo);
    }

    /**
     * 添加
     * @param foodInfo
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody FoodInfo foodInfo){
        System.out.println(foodInfo.toString());
        foodService.add(foodInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        System.out.println(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        foodService.del(id);
        return resultVO;
    }
    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("get/{id}")
    public FoodInfo get(@PathVariable Integer id){
        FoodInfo foodInfo = foodService.selById(id);
        System.out.println(foodInfo);
        return foodInfo;
    }

    @RequestMapping("list")
    public List<FoodInfo> getall(){
        List<FoodInfo> foodInfos = foodService.selAll();
        System.out.println(foodInfos);
        return foodInfos;
    }

    @RequestMapping("update")
    public ResultVO update(@RequestBody FoodInfo foodInfo){
        System.out.println(foodInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        foodService.update(foodInfo);
        return resultVO;
    }
}
