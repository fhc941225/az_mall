package com.az.manager.controller;


import com.az.manager.iService.OrderItemService;
import com.az.manager.pojo.dto.OrderDto;
import com.az.manager.pojo.dto.OrderRequestData;
import com.az.manager.pojo.po.OrderPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderItemService service;

    @PostMapping("/listOrder")
    public OrderDto ListOrder(@RequestBody OrderRequestData orderRequestData){
        return service.ListOrder(orderRequestData);
    }

    @PostMapping("/orders")
    public OrderPo Orders(@RequestBody int order_no){
        return service.ListOrders(order_no);
    }


}
