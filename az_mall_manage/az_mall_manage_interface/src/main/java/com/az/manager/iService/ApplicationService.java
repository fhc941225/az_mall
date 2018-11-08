package com.az.manager.iService;

import com.az.manager.pojo.dto.ListApplicationDto;
import com.az.manager.pojo.po.ApplicationPo;
import com.az.manager.pojo.vo.ListApplicationAndStoreVo;

public interface ApplicationService {

    ListApplicationDto listApplication(ListApplicationAndStoreVo listApplicationAndStoreVo);

    int updateState(ApplicationPo applicationPo);
}
