package com.lijie.bs_healthy.service.impl;

import com.lijie.bs_healthy.mapper.FoodCalendarMapper;
import com.lijie.bs_healthy.model.FoodCalendarInfo;
import com.lijie.bs_healthy.service.FoodCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiJie
 * @date 2020/6/15-15:26
 */
@Service
public class FoodCalendarServiceImpl implements FoodCalendarService {
    @Autowired
    FoodCalendarMapper foodCalendarMapper;

    //查询所有餐食记录
    @Override
    public List<FoodCalendarInfo> selClientAll(FoodCalendarInfo foodCalenderInfo) {
        return foodCalendarMapper.selClientAll(foodCalenderInfo);
    }

    //添加餐食记录
    @Override
    public void add(FoodCalendarInfo foodCalenderInfo) {
        foodCalendarMapper.add(foodCalenderInfo);
    }

    //删除餐食记录
    @Override
    public void del(FoodCalendarInfo foodCalenderInfo) {
        foodCalendarMapper.del(foodCalenderInfo);
    }



    //更新
    @Override
    public void update(FoodCalendarInfo foodCalenderInfo) {
        foodCalendarMapper.update(foodCalenderInfo);
    }


    @Override
    //得到当天的餐食记录
    public FoodCalendarInfo selByDate(FoodCalendarInfo foodCalenderInfo) {
        return foodCalendarMapper.selByDate(foodCalenderInfo);
    }
}
