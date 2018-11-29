package com.az.manager.controller;

import com.az.manager.iService.ItemService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * User: DHC
 * Date: 2018/10/25
 * Time: 15:28
 * Version:V1.0
 */
@Controller
public class ManagerIndexAction {
    @Autowired
    private ItemService itemService;


    @ResponseBody
    @PostMapping("/item/indexlib/import")
    public Map<String,Object> importIndex(){
        return itemService.importIndex();
    }
}
