package com.az.seckill.controller;

import com.az.seckill.po.SeckillOrderPo;
import com.az.seckill.service.SeckillPublishService;
import com.az.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/seckill")
public class SeckillController {
   @Autowired
    private SeckillPublishService service;
    @PostMapping("/seckill")
    @ResponseBody
    public Map<String,String> seckill(@RequestBody SeckillOrderPo order){
        String result=service.publish(order);
        Map<String,String> map=new HashMap<>();
        map.put("msg",result);
        return map;
    }
}