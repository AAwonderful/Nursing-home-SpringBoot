package com.lijie.bs_healthy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.mapper.FoodInfoMapper;
import com.lijie.bs_healthy.model.FoodInfo;
import com.lijie.bs_healthy.service.FoodService;
import com.lijie.bs_healthy.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiJie
 * @date 2020/6/15-10:41
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodInfoMapper foodInfoMapper;

    public List<FoodInfo> selAll(){

        return foodInfoMapper.selAll(new FoodInfo());
    }

    public void add(FoodInfo foodInfo){
        foodInfoMapper.add(foodInfo);
    }

    public void del(Integer id){
        foodInfoMapper.del(id);
    }

    public FoodInfo selById(Integer id){
        return foodInfoMapper.selById(id);
    }

    public void update(FoodInfo foodInfo){
        foodInfoMapper.update(foodInfo);
    }

    @Override
    public PageInfo query(Integer currPage, FoodInfo foodInfo) {
        //如果当前页没有值，默认第一页
        if(currPage == null) currPage=1;
        PageHelper.startPage(currPage, Define.PAGE_SIZE);
        PageInfo<FoodInfo> pageInfo = new PageInfo<>(foodInfoMapper.selAll(foodInfo));
        return pageInfo;
    }
}
