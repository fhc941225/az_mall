package com.az.manager.pojo.dto;

public class PageMessageDto {
    private Integer startPage;
    private Integer pageSize;
    private String searcherId;
    private String searcherUsername;

    @Override
    public String toString() {
        return "PageMessageDto{" +
                "startPage=" + startPage +
                ", pageSize=" + pageSize +
                ", searcherId='" + searcherId + '\'' +
                ", searcherUserName='" + searcherUsername + '\'' +
                '}';
    }

    public String getSearcherUsername() {
        return searcherUsername;
    }

    public void setSearcherUsername(String searcherUserName) {
        this.searcherUsername = searcherUserName;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearcherId() {
        return searcherId;
    }

    public void setSearcherId(String searcherId) {
        this.searcherId = searcherId;
    }
}