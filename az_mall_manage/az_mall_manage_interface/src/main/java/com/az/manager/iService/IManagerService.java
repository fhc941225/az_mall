package com.az.manager.iService;

import com.az.manager.pojo.dto.ManagerDto;
import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.po.TbManager;
import com.az.manager.pojo.vo.ManagerVo;
import com.az.manager.pojo.vo.PageInfo;

public interface IManagerService {
    ManagerPo checkLogin(ManagerVo managerVo);

    ManagerDto<TbManager> selectallManager(PageInfo pageInfo);

    void addManager(TbManager tbManager);
}