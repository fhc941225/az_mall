package com.az.seckill.service;

import com.az.seckill.po.SeckillOrderPo;

public interface SeckillService {
    //添加订单信息并使库存减一
    void addOrder(SeckillOrderPo order);


}