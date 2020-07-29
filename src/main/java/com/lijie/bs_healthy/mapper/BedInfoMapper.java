package com.lijie.bs_healthy.mapper;



import com.lijie.bs_healthy.model.BedInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BedInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BedInfo record);

    BedInfo selectByPrimaryKey(Integer id);

    List<BedInfo> selectAll(BedInfo bedInfo);

    int updateByPrimaryKey(BedInfo record);

    List<BedInfo> selectByState(BedInfo bedInfo);

}