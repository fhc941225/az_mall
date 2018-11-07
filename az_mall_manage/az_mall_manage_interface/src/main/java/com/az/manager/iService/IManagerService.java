package com.az.manager.iService;

import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.vo.ManagerVo;

public interface IManagerService {
    ManagerPo checkLogin(ManagerVo managerVo);
}