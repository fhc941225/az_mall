package com.az.seckill.serviceImpl;

import com.az.seckill.jedis.JedisClient;
import com.az.seckill.po.SeckillOrderPo;
import com.az.seckill.service.SeckillPublishService;
import org.springframework.beans.factory.annotation.Autowired;

public class SeckillPublishServiceImpl implements SeckillPublishService{
    @Autowired
    private JedisClient jedisClient;
    /**
     * 从redis中判断是否还有库存，有则redis库存数量减一，返回秒杀成功提示，并将
     * 信息发布到消息队列中，生成真正订单，没有则直接返回失败信息
     * @param order
     * @return
     */
    @Override
    public String publish(SeckillOrderPo order) {
        try{
            //取出库存数
            int count = Integer.parseInt(jedisClient.hget("productCount", order.getProductId()));
            if(count>0){
                String num=count-1+"";
                //库存减一
                jedisClient.hset("productCount","order.getProductId()",num);
                return "success";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "fail";
    }
}