package com.az.manager.service;

import com.az.manager.dao.ManagerMapper;
import com.az.manager.iService.IManagerService;
import com.az.manager.pojo.dto.ManagerDto;
import com.az.manager.pojo.po.ManagerPo;
import com.az.manager.pojo.po.TbManager;
import com.az.manager.pojo.vo.ManagerVo;
import com.az.manager.pojo.vo.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService implements IManagerService {
    /*要使用接口，不需要使用具体实现（log4j logback）*/
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public ManagerPo checkLogin(ManagerVo managerVo) {
        ManagerPo manager = managerMapper.selectByNameAndPassword(managerVo);
        return manager;
    }

    @Override
    public ManagerDto<TbManager> selectallManager(PageInfo pageInfo) {
        /*new Userdato 把从数据库里查道德数据进行封装*/
        ManagerDto<TbManager> managerDto = new ManagerDto<>();

        try {

            /*统计所有用户总数*/
            long count = managerMapper.countManager();
            /*将统计所有用户总数进行封装*/
            managerDto.setCoumm(count);
            /*查询所有用户信息*/
            List<TbManager> users = managerMapper.selectallManager(pageInfo);
            /*封装查到所有用户信息*/
            managerDto.setList(users);

        }catch (Exception e){
            /*查询发生异常时将进行日志输出(输出到控制台还是到日志文件,由logback.xml决定)*/
            logger.error(e.getMessage(), e);

        }
        /*将所有的数据返回给web层*/

        return managerDto;
    }
    /*添加用户*/
    @Override
    public void addManager(TbManager tbManager) {
        try {
            /*调用dao层的添加方法*/
            managerMapper.addManager(tbManager);

        }catch (Exception e){
            /*查询发生异常时将进行日志输出(输出到控制台还是到日志文件,由logback.xml决定)*/
            logger.error(e.getMessage(), e);
        }
    }
}