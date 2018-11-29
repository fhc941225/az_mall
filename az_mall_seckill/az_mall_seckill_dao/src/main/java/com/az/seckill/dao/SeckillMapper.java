package com.az.seckill.dao;

import com.az.seckill.po.SeckillOrderPo;

public interface SeckillMapper {
    void saveOrder(SeckillOrderPo order);
    void updateCount(SeckillOrderPo order);
}