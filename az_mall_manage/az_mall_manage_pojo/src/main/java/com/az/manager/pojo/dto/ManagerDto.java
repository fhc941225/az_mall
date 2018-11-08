package com.az.manager.pojo.dto;

import java.util.List;

public class ManagerDto<T> {

    private Long coumm;
    private List<T> list;

    public Long getCoumm() {
        return coumm;
    }

    public void setCoumm(Long coumm) {
        this.coumm = coumm;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Userdato{" +
                "coumm=" + coumm +
                ", list=" + list +
                '}';
    }
}
