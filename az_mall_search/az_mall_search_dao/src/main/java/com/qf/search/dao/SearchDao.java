package com.qf.search.dao;

import com.qf.search.pojo.po.ItemSearchResult;
import com.qf.search.pojo.vo.TbItemSearchCustom;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: DHC
 * Date: 2018/11/15
 * Time: 15:29
 * Version:V1.0
 */
@Repository
public class SearchDao {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SolrServer solrServer;

    public ItemSearchResult search(SolrQuery query, int pageIndex, int pageSize) {
        ItemSearchResult result = new ItemSearchResult();
        try {
            //获取响应
            QueryResponse response = solrServer.query(query);
            //获取DoucumentList
            SolrDocumentList documentList = response.getResults();
            //获取索引库中的总记录数
            long totalRecords = documentList.getNumFound();
            result.setTotalRecords(totalRecords);
            //计算总页数
            long totalPages = (totalRecords + pageSize - 1) / pageSize;
            result.setTotalPages(totalPages);
            //获取高亮集合
            Map<String, Map<String, List<String>>> map = response.getHighlighting();
            //获取List
            List<TbItemSearchCustom> list = new ArrayList<TbItemSearchCustom>();
            for (SolrDocument document : documentList) {
                //
                TbItemSearchCustom item = new TbItemSearchCustom();
                item.setId((String) document.get("id"));
                item.setSellPoint((String) document.get("item_sell_point"));
                item.setPrice((Long) document.get("item_price"));
                item.setImage((String) document.get("item_image")) ;
                item.setCatName((String) document.get("item_category_name"));
                //获取高亮集合中标题
                List<String> titleList = map.get(document.get("id")).get("item_title");
                String title = "";
                if (titleList != null && !titleList.isEmpty()) {
                    title = titleList.get(0);
                } else {
                    title = (String) document.get("item_title");
                }
                item.setTitle(title);
                list.add(item);
            }
            result.setList(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }
}
