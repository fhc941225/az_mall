package com.az.manager.iService;

import com.az.manager.pojo.dto.ComplaintListDto;
import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.SelectPageDto;
import com.az.manager.pojo.vo.ComplaintVo;

public interface IComplaintService {
    ComplaintListDto findByPage(SelectPageDto dto);
    void modifyState(ComplaintVo complaintVo);
}