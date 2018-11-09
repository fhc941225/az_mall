package com.az.manager.dao;



import com.az.manager.pojo.dto.OrderRequestData;
import com.az.manager.pojo.po.OrderItemPo;

import java.util.List;

public interface OrderMapper {

    Long selectCount(OrderRequestData orderRequestData);

    List<OrderItemPo> selectOrdetItems(OrderRequestData orderRequestData);
}
