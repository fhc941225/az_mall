package com.az.manager.controller;

import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.UserListMessageDto;
import com.az.manager.iService.IUserService;
import com.az.manager.pojo.vo.DisabledVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/selectByPageMessage",method = RequestMethod.POST)
    @ResponseBody
    public UserListMessageDto selectByMessage(PageMessageDto message){
        UserListMessageDto dto=userService.selectByPageMessage(message);
        return dto;
    }
    @RequestMapping(value = "/changeDisabled",method = RequestMethod.POST)
    @ResponseBody
    public String changeDisabled(DisabledVo disabledVo){
        userService.changeDisabled(disabledVo);
        return "ok";
    }
}