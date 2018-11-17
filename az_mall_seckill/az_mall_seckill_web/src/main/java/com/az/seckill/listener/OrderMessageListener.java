package com.az.seckill.listener;

import com.az.seckill.po.SeckillOrderPo;
import com.az.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * 订单信息订阅者
 */
public class OrderMessageListener implements MessageListener {
    @Autowired
    private SeckillService seckillService;

    @Override
    public void onMessage(Message message) {
        try {
            //1. 获取消息
            ObjectMessage objectMessage = (ObjectMessage)message;
            SeckillOrderPo order=(SeckillOrderPo)(objectMessage.getObject());
            //2. 添加订单，库存减一
            seckillService.addOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}