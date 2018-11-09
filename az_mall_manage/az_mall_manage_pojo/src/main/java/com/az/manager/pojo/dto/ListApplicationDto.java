package com.az.manager.pojo.dto;

import com.az.manager.pojo.po.ApplicationPo;

import java.util.List;

public class ListApplicationDto {

    private Long total;
    private List<ApplicationPo> applications;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<ApplicationPo> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationPo> applications) {
        this.applications = applications;
    }
}
