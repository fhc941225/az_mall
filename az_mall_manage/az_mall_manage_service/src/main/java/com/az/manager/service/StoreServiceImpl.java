package com.az.manager.service;

import com.az.manager.dao.StoreMapper;
import com.az.manager.iService.StoreService;
import com.az.manager.pojo.po.StorePo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper mapper;

    //列出所有商店
    @Override
    @Transactional(readOnly = true)
    public Map<String, Object> ListStore(ListApplicationAndStoreVo listApplicationAndStoreVo) {
        Map<String, Object> response = new HashMap<>();
        response.put("total",mapper.selectCount(listApplicationAndStoreVo));
        response.put("store",mapper.selectStore(listApplicationAndStoreVo));
        return response;
    }

    //改状态
    @Override
    public int updateState(StorePo storePo) {
        return mapper.updateState(storePo);
    }
}
