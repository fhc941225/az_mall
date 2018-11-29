package com.qf.search.pojo.po;

import com.qf.search.pojo.vo.TbItemSearchCustom;

import java.util.List;

/**
 * User: DHC
 * Date: 2018/11/15
 * Time: 15:09
 * Version:V1.0
 */
public class ItemSearchResult {
    private long totalRecords;
    private long totalPages;
    private List<TbItemSearchCustom> list;

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<TbItemSearchCustom> getList() {
        return list;
    }

    public void setList(List<TbItemSearchCustom> list) {
        this.list = list;
    }

}
