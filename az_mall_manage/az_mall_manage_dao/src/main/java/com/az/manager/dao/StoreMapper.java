package com.az.manager.dao;

import com.az.manager.pojo.po.StorePo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;

import java.util.List;

public interface StoreMapper {

    Long selectCount(ListApplicationAndStoreVo listApplicationAndStoreVo);

    List<StorePo> selectStore(ListApplicationAndStoreVo listApplicationAndStoreVo);

    int updateState(StorePo storePo);

    int insertStore(StorePo storePo);
}
