package com.lijie.bs_healthy.mapper;

import com.lijie.bs_healthy.model.HuliInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HuliInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HuliInfo record);

    HuliInfo selectByPrimaryKey(Integer id);

    List<HuliInfo> selectAll();

    int updateByPrimaryKey(HuliInfo record);

    List<HuliInfo>queryAll(HuliInfo huliInfo);
}