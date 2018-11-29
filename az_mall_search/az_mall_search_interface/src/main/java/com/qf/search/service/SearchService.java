package com.qf.search.service;

import com.qf.search.pojo.po.ItemSearchResult;

/**
 * User: DHC
 * Date: 2018/11/15
 * Time: 15:08
 * Version:V1.0
 */
public interface SearchService {
    /**
     *
     * @param keyword
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ItemSearchResult search(String keyword, int pageIndex, int pageSize);
}
