package com.az.manager.pojo.dto;

import com.az.manager.pojo.po.UserPo;

import java.util.List;

public class UserListMessageDto {
    private Long count;
    private List<UserPo> users;

    @Override
    public String toString() {
        return "UserListMessageDto{" +
                "count=" + count +
                ", users=" + users +
                '}';
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<UserPo> getUsers() {
        return users;
    }

    public void setUsers(List<UserPo> users) {
        this.users = users;
    }
}