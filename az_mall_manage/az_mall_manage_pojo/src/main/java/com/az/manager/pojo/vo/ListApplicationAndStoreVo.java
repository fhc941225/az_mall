package com.az.manager.pojo.vo;

public class ListApplicationAndStoreVo {

    private Integer currentPage;
    private Integer pageSize;
    private String searchUname;
    private String searchName;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return (currentPage-1)*pageSize;
    }

    public String getSearchUname() {
        return searchUname;
    }

    public void setSearchUname(String searchUname) {
        this.searchUname = searchUname;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
