package com.az.manager.service;

import com.az.manager.pojo.dto.PageMessageDto;
import com.az.manager.pojo.dto.UserListMessageDto;
import com.az.manager.iService.IUserService;
import com.az.manager.pojo.po.UserPo;
import com.az.manager.dao.UserMapper;
import com.az.manager.pojo.vo.DisabledVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userMapper;
    //根据搜索，分页信息返回值
    @Override
    public UserListMessageDto selectByPageMessage(PageMessageDto pageMessage) {
        UserListMessageDto dto=new UserListMessageDto();
        try{
            List<UserPo> users=userMapper.selectByPage(pageMessage);
            Long count=userMapper.userCount(pageMessage);
            dto.setCount(count);
            dto.setUsers(users);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return dto;
    }

    @Override
    @Transactional
    public void changeDisabled(DisabledVo disabledVo) {
        try{
            userMapper.updateDisabled(disabledVo);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }

    }
}