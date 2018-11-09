package com.az.manager.controller;

import com.az.manager.iService.ApplicationService;
import com.az.manager.pojo.dto.ListApplicationDto;
import com.az.manager.pojo.po.ApplicationPo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationAction {

    @Autowired
    private ApplicationService service;

    @PostMapping("/list")
    public ListApplicationDto listApplication(@RequestBody ListApplicationAndStoreVo listApplicationAndStoreVo){
        return service.listApplication(listApplicationAndStoreVo);
    }

    @PostMapping("/updateState")
    public int updateState(@RequestBody ApplicationPo applicationPo){
        return service.updateState(applicationPo);
    }

}
