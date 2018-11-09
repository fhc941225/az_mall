package com.az.manager.iService;


import com.az.manager.pojo.dto.OrderDto;
import com.az.manager.pojo.dto.OrderRequestData;
import com.az.manager.pojo.po.OrderPo;


public interface OrderItemService {

    OrderDto ListOrder(OrderRequestData orderRequestData);

    OrderPo ListOrders(int order_no);
}
