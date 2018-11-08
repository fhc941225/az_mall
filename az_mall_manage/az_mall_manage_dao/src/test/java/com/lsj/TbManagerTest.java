package com.lsj;

import com.az.manager.dao.ManagerMapper;
import com.az.manager.dao.TbManagerMapper;
import com.az.manager.pojo.po.TbManager;
import com.az.manager.pojo.vo.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TbManagerTest {
    @Autowired
    private TbManagerMapper tbManagerMapper;

    @Autowired
    private ManagerMapper managerMapper;

    @Test
    public void select(){
        TbManager tbManager = new TbManager();
        tbManager.setId(1);

        TbManager tbManager1 = tbManagerMapper.selectByPrimaryKey(13);
        System.out.println(tbManager1);


    }
    @Test
    public void selectall(){

        PageInfo p= new PageInfo();
        p.setCurrentPage(1);
        p.setPageSize(5);

        List<TbManager> tbManagers = managerMapper.selectallManager(p);
        long l = managerMapper.countManager();
        System.out.println(tbManagers+":"+l);
    }

}
