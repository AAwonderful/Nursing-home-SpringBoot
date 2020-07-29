package com.lijie.bs_healthy.mapper;



import com.lijie.bs_healthy.model.CheckoutInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CheckoutInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckoutInfo record);

    CheckoutInfo selectByPrimaryKey(Integer id);

    List<CheckoutInfo> selectAll(CheckoutInfo checkoutInfo);

    int updateByPrimaryKey(CheckoutInfo record);
}