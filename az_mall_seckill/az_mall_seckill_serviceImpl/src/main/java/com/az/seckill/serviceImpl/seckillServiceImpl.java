package com.az.seckill.serviceImpl;

import com.az.seckill.dao.SeckillMapper;
import com.az.seckill.po.SeckillOrderPo;
import com.az.seckill.service.SeckillService;
import com.az.seckill.vo.HotSeckillProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeckillServiceImpl implements SeckillService {
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

    @Override
    public List<HotSeckillProductVo> findHotProduct() {
        return seckillDao.selectHotProduct();
    }
}