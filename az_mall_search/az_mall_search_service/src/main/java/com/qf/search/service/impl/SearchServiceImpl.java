package com.qf.search.service.impl;

import com.qf.search.dao.SearchDao;
import com.qf.search.pojo.po.ItemSearchResult;
import com.qf.search.service.SearchService;
import org.apache.solr.client.solrj.SolrQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: DHC
 * Date: 2018/11/15
 * Time: 15:16
 * Version:V1.0
 */
@Service
public class SearchServiceImpl implements SearchService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SearchDao searchDao;

    @Override
    public ItemSearchResult search(String keyword, int pageIndex, int pageSize) {
        ItemSearchResult result = null;
        try {
            //获取查询对象
            SolrQuery query = new SolrQuery();
            //设置查询对象的各个属性
            query.setQuery(keyword);
            query.setStart((pageIndex - 1) * pageSize);
            query.setRows(pageSize);
            query.set("df", "item_keywords");
            query.setHighlight(true);
            query.addHighlightField("item_title");
            query.setHighlightSimplePre("<font  style='color:red'>");
            query.setHighlightSimplePost("</font>");
            //执行查询
            result = searchDao.search(query,pageIndex,pageSize);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }
}
