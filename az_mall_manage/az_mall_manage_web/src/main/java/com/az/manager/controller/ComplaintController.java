package com.az.manager.controller;

import com.az.manager.iService.IComplaintService;
import com.az.manager.pojo.dto.ComplaintListDto;
import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.SelectPageDto;
import com.az.manager.pojo.vo.ComplaintVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/complaint")
public class ComplaintController {
    @Autowired
    private IComplaintService service;

    @PostMapping("/listComplaints")
    @ResponseBody
    public ComplaintListDto listComplaints(@RequestBody SelectPageDto dto){
        ComplaintListDto listDto=service.findByPage(dto);
        return listDto;
    }

    @PostMapping("/updateState")
    @ResponseBody
    public String updateState(@RequestBody ComplaintVo complaintVo){
        try{
            service.modifyState(complaintVo);
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }

}