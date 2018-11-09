package com.az.manager.pojo.dto;

public class OrderRequestData {

    private int currentPage;
    private int pageSize;
    private String search;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    public int getOffset(){
        return (currentPage-1)*pageSize;
    }
}
