package com.az.manager.dao;

import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.SelectPageDto;
import com.az.manager.pojo.vo.ComplaintVo;

import java.util.List;

public interface ComplaintMapper {
    List<ComplaintVo> selectByPage(SelectPageDto dto);
    void updateState(ComplaintVo complaintVo);
    Long count(SelectPageDto dto);
}