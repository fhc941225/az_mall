package com.az.manager.service;

import com.az.manager.dao.ApplicationMapper;
import com.az.manager.dao.StoreMapper;
import com.az.manager.iService.ApplicationService;
import com.az.manager.pojo.dto.ListApplicationDto;
import com.az.manager.pojo.po.ApplicationPo;
import com.az.manager.pojo.po.StorePo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper mapper;
    @Autowired
    private StoreMapper storeMapper;

    //列出所有请求
    @Override
    @Transactional(readOnly = true)
    public ListApplicationDto listApplication(ListApplicationAndStoreVo listApplicationAndStoreVo) {
        ListApplicationDto applicationDto = new ListApplicationDto();
        //查总数
        Long total = mapper.selectCount(listApplicationAndStoreVo);
        applicationDto.setTotal(total);
        //查所有请求
        List<ApplicationPo> applications = mapper.selectApplication(listApplicationAndStoreVo);
        applicationDto.setApplications(applications);
        return applicationDto;
    }

    //审批（改state）
    @Override
    public int updateState(ApplicationPo applicationPo) {
        int i = mapper.updateState(applicationPo);
        //如果审批通过，新增该店铺
        if(applicationPo.getState() == 1){
            StorePo store = new StorePo();
            store.setId(UUID.randomUUID().toString());
            store.setUid(applicationPo.getUid());
            store.setName(applicationPo.getName());
            store.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            store.setState((short)0);
            storeMapper.insertStore(store);
        }
        return i;
    }

}
