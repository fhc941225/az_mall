package com.az.manager.controller;

import com.az.manager.iService.StoreService;
import com.az.manager.pojo.po.StorePo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreAction {

    @Autowired
    private StoreService service;

    @PostMapping("/list")
    public Map<String, Object> list(@RequestBody ListApplicationAndStoreVo listApplicationAndStoreVo){
        return service.ListStore(listApplicationAndStoreVo);
    }

    @PostMapping("/changeState")
    public int changeState(@RequestBody StorePo storePo){
        return service.updateState(storePo);
    }
}
