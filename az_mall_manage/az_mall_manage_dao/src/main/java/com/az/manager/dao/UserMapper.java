package com.az.manager.dao;

import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.po.UserPo;
import com.az.manager.pojo.vo.DisabledVo;

import java.util.List;

public interface UserMapper {
    Long userCount(PageMessageDto pageMessage);
    List<UserPo> selectByPage(PageMessageDto pageMessage);
    void updateDisabled(DisabledVo vo);
}