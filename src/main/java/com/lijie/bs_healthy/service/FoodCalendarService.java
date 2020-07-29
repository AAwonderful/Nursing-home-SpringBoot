package com.lijie.bs_healthy.service;

import com.lijie.bs_healthy.mapper.FoodCalendarMapper;
import com.lijie.bs_healthy.model.FoodCalendarInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiJie
 * @date 2020/6/15-15:23
 */
@Service
public interface FoodCalendarService {
    List<FoodCalendarInfo> selClientAll(FoodCalendarInfo foodCalenderInfo);

    void add(FoodCalendarInfo foodCalenderInfo);

    void del(FoodCalendarInfo foodCalenderInfo);



    void update(FoodCalendarInfo foodCalenderInfo);

    //得到当天的餐食记录
    FoodCalendarInfo selByDate(FoodCalendarInfo foodCalenderInfo);
}
