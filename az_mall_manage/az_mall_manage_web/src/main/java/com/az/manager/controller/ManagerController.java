package com.az.manager.controller;

import com.az.manager.iService.IManagerService;
import com.az.manager.pojo.dto.ManagerDto;
import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.po.TbManager;
import com.az.manager.pojo.vo.ManagerVo;
import com.az.manager.pojo.vo.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    /*
     *查询所有+分页功能
     */
    @RequestMapping(value = "/managerAll")
    @ResponseBody
    public ManagerDto<TbManager> selectallManager(@RequestBody PageInfo pageInfo){
        /*将请求发送到service层*/
        ManagerDto<TbManager> managerDto = managerService.selectallManager(pageInfo);

        /*返回JSON数据*/
        return managerDto;
    }
    @RequestMapping("/managerAdd")
    @ResponseBody
    public void addManager(@RequestBody TbManager tbManager){

        managerService.addManager(tbManager);
    }



}