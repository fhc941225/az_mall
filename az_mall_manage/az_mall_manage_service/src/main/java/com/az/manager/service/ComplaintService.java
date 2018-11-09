package com.az.manager.service;

import com.az.manager.dao.ComplaintMapper;
import com.az.manager.iService.IComplaintService;
import com.az.manager.pojo.dto.ComplaintListDto;
import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.SelectPageDto;
import com.az.manager.pojo.vo.ComplaintVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService implements IComplaintService {
    @Autowired
    private ComplaintMapper mapper;
    @Override
    public ComplaintListDto findByPage(SelectPageDto dto) {
        ComplaintListDto listDto=new ComplaintListDto();
        List<ComplaintVo> vos=mapper.selectByPage(dto);
        Long count=mapper.count(dto);
        listDto.setCount(count);
        listDto.setComplaintVos(vos);
        return listDto;
    }

    @Override
    public void modifyState(ComplaintVo complaintVo) {
        mapper.updateState(complaintVo);
    }
}