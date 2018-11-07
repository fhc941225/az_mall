package com.az.manager.controller;

import com.az.manager.iService.IManagerService;
import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.vo.ManagerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private IManagerService managerService;

    @RequestMapping(value = "/checkLogin")
    @ResponseBody
    public ManagerPo checkLogin(ManagerVo managerVo){
        ManagerPo manager=managerService.checkLogin(managerVo);
        return manager;
    }
}