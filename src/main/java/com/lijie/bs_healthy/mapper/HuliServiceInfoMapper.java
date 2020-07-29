package com.lijie.bs_healthy.mapper;



import com.lijie.bs_healthy.model.HuliServiceInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface HuliServiceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HuliServiceInfo record);

    HuliServiceInfo selectByPrimaryKey(Integer id);

    List<HuliServiceInfo> selectAll();

    int updateByPrimaryKey(HuliServiceInfo record);

    List<HuliServiceInfo>queryAll(HuliServiceInfo huliServiceInfo);
}