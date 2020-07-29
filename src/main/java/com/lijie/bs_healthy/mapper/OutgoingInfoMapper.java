package com.lijie.bs_healthy.mapper;



import com.lijie.bs_healthy.model.OutgoingInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface OutgoingInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutgoingInfo record);

    OutgoingInfo selectByPrimaryKey(Integer id);

    List<OutgoingInfo> selectAll(OutgoingInfo outgoingInfo);

    int updateByPrimaryKey(OutgoingInfo record);
}