package com.lijie.bs_healthy.mapper;



import com.lijie.bs_healthy.model.CheckinInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CheckinInfoMapper {
    int deleteByPrimaryKey(Integer custId);

    int insert(CheckinInfo record);

    CheckinInfo selectByPrimaryKey(Integer custId);

    List<CheckinInfo> selectAll(CheckinInfo checkinInfo);

    int updateByPrimaryKey(CheckinInfo record);
}