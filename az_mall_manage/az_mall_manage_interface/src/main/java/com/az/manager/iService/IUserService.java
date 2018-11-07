package com.az.manager.iService;

import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.UserListMessageDto;
import com.az.manager.pojo.vo.DisabledVo;

public interface IUserService {
    UserListMessageDto selectByPageMessage(PageMessageDto pageMessage);
    void changeDisabled(DisabledVo disabledVo);
}