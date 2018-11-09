package com.az.manager.iService;

import com.az.manager.pojo.po.StorePo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;

import java.util.Map;

public interface StoreService {

    Map<String,Object> ListStore(ListApplicationAndStoreVo listApplicationAndStoreVo);

    int updateState(StorePo storePo);

}
