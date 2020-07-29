package com.lijie.bs_healthy.controller;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.mapper.FoodCalendarMapper;
import com.lijie.bs_healthy.model.FoodCalendarInfo;
import com.lijie.bs_healthy.model.FoodInfo;
import com.lijie.bs_healthy.service.FoodCalendarService;
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
 * @date 2020/6/15-15:31
 */
@RestController
@RequestMapping("foodCalendar")
public class FoodCalendarController {
    @Resource
    FoodCalendarService foodCalendarService;

    /**
     * 增加一天的餐食
     * @param calendarInfos
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody FoodCalendarInfo calendarInfos){
        ResultVO resultVO=null;
        if (calendarInfos==null){
            resultVO = new ResultVO(500,"添加数据为空");
        }else{
                foodCalendarService.add(calendarInfos);
            resultVO = new ResultVO(200,"添加成功");
            }
        return resultVO;
    }

    /**
     * 查询某天的餐食
     * @param foodCalendarInfo
     * @return
     */
    @RequestMapping("selByDate")
    public FoodCalendarInfo getByDate(@RequestBody FoodCalendarInfo foodCalendarInfo){
        FoodCalendarInfo foodCalendarInfo1 = foodCalendarService.selByDate(foodCalendarInfo);
        return foodCalendarInfo1;
    }

    /**
     * 更新某一天的餐食
     * @param calendarInfos
     * @return
     */
    @RequestMapping("updateByDate")
    public ResultVO updatebyDate(@RequestBody FoodCalendarInfo calendarInfos){
        ResultVO resultVO=null;
        if (calendarInfos==null){
            resultVO = new ResultVO(500,"修改数据为空");
        }else{
                foodCalendarService.update(calendarInfos);
            resultVO = new ResultVO(200,"修改成功");
        }
        return resultVO;
    }

}
