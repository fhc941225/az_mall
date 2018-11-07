package com.az.manager.pojo.vo;

public class DisabledVo {
    private String id;
    private Integer disabled;

    @Override
    public String toString() {
        return "DisabledVo{" +
                "id='" + id + '\'' +
                ", disabled=" + disabled +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}