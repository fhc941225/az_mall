package com.az.manager.pojo.vo;

import com.az.manager.pojo.po.UserPo;

public class StoreVo {
    private String name;
    private UserPo user;

    @Override
    public String toString() {
        return "StoreVo{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserPo getUser() {
        return user;
    }

    public void setUser(UserPo user) {
        this.user = user;
    }

}