package com.az.manager.dao;

import com.az.manager.pojo.vo.ListApplicationAndStoreVo;
import com.az.manager.pojo.po.ApplicationPo;

import java.util.List;

public interface ApplicationMapper {

    Long selectCount(ListApplicationAndStoreVo listApplicationAndStoreVo);

    List<ApplicationPo> selectApplication(ListApplicationAndStoreVo listApplicationAndStoreVo);

    int updateState(ApplicationPo applicationPo);
}
