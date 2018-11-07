package com.az.manager.service;

import com.az.manager.dao.ManagerMapper;
import com.az.manager.iService.IManagerService;
import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.vo.ManagerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService implements IManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public ManagerPo checkLogin(ManagerVo managerVo) {
        ManagerPo manager = managerMapper.selectByNameAndPassword(managerVo);
        return manager;
    }
}