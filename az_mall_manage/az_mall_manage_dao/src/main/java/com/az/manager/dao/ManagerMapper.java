package com.az.manager.dao;

import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.po.TbManager;
import com.az.manager.pojo.vo.ManagerVo;
import com.az.manager.pojo.vo.PageInfo;

import java.util.List;

public interface ManagerMapper {
    ManagerPo selectByNameAndPassword(ManagerVo managerVo);
    /*查询所有+分页*/
    List<TbManager> selectallManager(PageInfo pageInfo);
    /*统计所有用户的条数*/
    long countManager();
    /*添加用户*/
    void addManager(TbManager tbManager);
}