package com.az.manager.pojo.vo;

import com.az.manager.pojo.po.UserPo;

public class ComplaintVo {
    private String id;
    private String content;
    private String date;
    private Integer auditState;
    private UserPo user;
    private StoreVo store;

    public Integer getAuditState() {
        return auditState;
    }

    @Override
    public String toString() {
        return "ComplaintVo{" +
                "id='"+id+'\''+
                "content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", auditState=" + auditState +
                ", user=" + user +
                ", store=" + store +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserPo getUser() {
        return user;
    }

    public void setUser(UserPo user) {
        this.user = user;
    }

    public StoreVo getStore() {
        return store;
    }

    public void setStore(StoreVo store) {
        this.store = store;
    }
}