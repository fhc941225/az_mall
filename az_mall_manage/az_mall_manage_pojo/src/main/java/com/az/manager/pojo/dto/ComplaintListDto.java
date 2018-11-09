package com.az.manager.pojo.dto;

import com.az.manager.pojo.vo.ComplaintVo;

import java.util.List;

public class ComplaintListDto {
    private List<ComplaintVo> complaintVos;
    private Long count;

    @Override
    public String toString() {
        return "ComplaintListDto{" +
                "complaintVos=" + complaintVos +
                ", count=" + count +
                '}';
    }

    public List<ComplaintVo> getComplaintVos() {
        return complaintVos;
    }

    public void setComplaintVos(List<ComplaintVo> complaintVos) {
        this.complaintVos = complaintVos;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}