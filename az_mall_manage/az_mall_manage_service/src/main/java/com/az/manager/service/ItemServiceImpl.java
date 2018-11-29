package com.az.manager.service;

import com.az.manager.dao.TbItemCustomMapper;
import com.az.manager.dao.TbItemMapper;
import com.az.manager.iService.ItemService;
import com.az.manager.pojo.vo.TbItemSearchCustom;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: DHC
 * Date: 2018/10/29
 * Time: 14:30
 * Version:V1.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    //要使用接口，不需要使用具体实现（log4j logback）
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbItemCustomMapper itemCustomDao;
    @Autowired
    private TbItemMapper itemDao;
    @Autowired
    private SolrServer solrServer;


    @Override
    public Map<String, Object> importIndex() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", true);
        map.put("msg", "import success");
        try {
            //1 采集两个表的数据 tb_item tb_item_cat DAO 两个表的联查 List<>
            List<TbItemSearchCustom> list = itemCustomDao.listSearchItems();
            //2 导入索引库
                //2.1 遍历List it
            for (TbItemSearchCustom it : list){
                //2.2 SolrInputDocument document = new SolrInputDocument
                SolrInputDocument document = new SolrInputDocument();
                //2.3 document.addField("item_title",it.getTitle());document.addField("item_sell_point",it.getSellPoint());
                //这个方法中两个参数很重要： 第一个参数对应于conf/schema.xml field name
                //第二个参数对应于每个查询出来的实体的每个字段
                //id是conf/schema.xml自带的一个字段，不需要手工添加
                document.addField("id",it.getId());
                document.addField("item_sell_point",it.getSellPoint());
                document.addField("item_price",it.getPrice());
                document.addField("item_image",it.getImage());
                document.addField("item_category_name",it.getCatName());
                document.addField("item_title",it.getTitle());
                //2.4 solrServer.add(document);
                //写入索引库
                solrServer.add(document);
            }
            //2.5 等遍历结束之后，提交所有solrServer.commit();
            solrServer.commit();
        } catch (Exception e) {
            map.put("success", false);
            map.put("msg", "import failed");
            //查询发生异常时将进行日志输出(输出到控制台还是到日志文件,由logback.xml决定)
            logger.error(e.getMessage(), e);
        }
        return map;
    }
}
