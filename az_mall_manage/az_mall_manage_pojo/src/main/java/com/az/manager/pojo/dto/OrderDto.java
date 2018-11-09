package com.az.manager.pojo.dto;

import com.az.manager.pojo.po.OrderItemPo;

import java.util.List;

public class OrderDto {

    private Long count;
    private List<OrderItemPo> orders;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<OrderItemPo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItemPo> orders) {
        this.orders = orders;
    }
}
