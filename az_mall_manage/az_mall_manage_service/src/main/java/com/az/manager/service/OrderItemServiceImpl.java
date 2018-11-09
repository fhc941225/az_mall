package com.az.manager.service;


import com.az.manager.dao.OrderMapper;
import com.az.manager.iService.OrderItemService;
import com.az.manager.pojo.dto.OrderDto;
import com.az.manager.pojo.dto.OrderRequestData;
import com.az.manager.pojo.po.OrderPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderMapper orderDao;

    @Override
    public OrderDto ListOrder(OrderRequestData orderRequestData) {

        OrderDto orderDto=new OrderDto();
        orderDto.setCount(orderDao.selectCount(orderRequestData));
        orderDto.setOrders(orderDao.selectOrdetItems(orderRequestData));
        return orderDto;
    }

    @Override
    public OrderPo ListOrders(int order_no) {
        return null;
    }
}
