package com.lijie.bs_healthy.service;

import com.github.pagehelper.PageInfo;
import com.lijie.bs_healthy.model.FoodInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiJie
 * @date 2020/6/15-10:40
 */
@Service
public interface FoodService {
    List<FoodInfo> selAll();

    void add(FoodInfo foodInfo);

    void del(Integer id);

    FoodInfo selById(Integer id);

    void update(FoodInfo foodInfo);

    PageInfo query(Integer currPage, FoodInfo foodInfo);
}
