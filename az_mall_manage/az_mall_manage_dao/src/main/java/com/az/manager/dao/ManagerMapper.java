package com.az.manager.dao;

import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.vo.ManagerVo;

public interface ManagerMapper {
    ManagerPo selectByNameAndPassword(ManagerVo managerVo);
}