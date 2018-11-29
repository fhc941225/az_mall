package com.az.seckill.serviceImpl;

import com.az.seckill.dao.SeckillMapper;
import com.az.seckill.po.SeckillOrderPo;
import com.az.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class seckillServiceImpl implements SeckillService {
    @Autowired
    private SeckillMapper seckillDao;

    @Override
    public void addOrder(SeckillOrderPo order) {
        try {
            seckillDao.saveOrder(order);
            seckillDao.updateCount(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}