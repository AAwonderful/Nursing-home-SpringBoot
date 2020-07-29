package com.lijie.bs_healthy.mapper;

import com.lijie.bs_healthy.model.NurseInfo;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface NurseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NurseInfo record);

    NurseInfo selectByPrimaryKey(Integer id);

    List<NurseInfo> selectAll();

    int updateByPrimaryKey(NurseInfo record);

    NurseInfo selectByname(NurseInfo nurseInfo);

    List<NurseInfo>queryAll(NurseInfo nurseInfo);
}