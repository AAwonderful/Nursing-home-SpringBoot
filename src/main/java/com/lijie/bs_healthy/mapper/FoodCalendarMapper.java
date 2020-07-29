package com.lijie.bs_healthy.mapper;

import com.lijie.bs_healthy.model.FoodCalendarInfo;
import com.lijie.bs_healthy.model.FoodInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**餐食日历
 * @author LiJie
 * @date 2020/6/15-9:01
 */
@Component
public interface FoodCalendarMapper {
    //查询用户所有的餐食记录
    List<FoodCalendarInfo> selClientAll(FoodCalendarInfo foodCalenderInfo);

    void add(FoodCalendarInfo foodCalenderInfo);

    void del(FoodCalendarInfo foodCalenderInfo);



    void update(FoodCalendarInfo foodCalenderInfo);
    //得到当天的餐食记录
    FoodCalendarInfo selByDate(FoodCalendarInfo companyInfo);
}
