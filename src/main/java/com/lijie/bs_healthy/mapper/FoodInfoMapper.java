package com.lijie.bs_healthy.mapper;

import com.lijie.bs_healthy.model.FoodInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LiJie
 * @date 2020/6/15-10:33
 */
@Component
public interface FoodInfoMapper {
    List<FoodInfo> selAll(FoodInfo companyInfo);

    void add(FoodInfo foodInfo);

    void del(Integer id);

    FoodInfo selById(Integer id);

    void update(FoodInfo foodInfo);

}
