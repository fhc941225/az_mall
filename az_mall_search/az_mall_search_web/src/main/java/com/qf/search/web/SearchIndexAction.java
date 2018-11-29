package com.qf.search.web;

import com.qf.common.util.PropKit;
import com.qf.common.util.StrKit;
import com.qf.search.pojo.po.ItemSearchResult;
import com.qf.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: DHC
 * Date: 2018/11/15
 * Time: 14:51
 * Version:V1.0
 */
@Controller
public class SearchIndexAction {
    @Autowired
    private SearchService searchService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }
      @ResponseBody
    @GetMapping("/search")
    public ItemSearchResult search(String keyword, @RequestParam(defaultValue = "1") int pageIndex) {


            //获取前台过来的关键字
            //调用业务逻辑
            //返回DTO（总记录数，总页数，每页的集合）
            int pageSize = PropKit.use("content.properties").getInt("search.pagesize");
            ItemSearchResult result = searchService.search(keyword, pageIndex, pageSize);
            
            //存放request范围
            //model.addAttribute("list", result.getList());

        return result;
    }
}
