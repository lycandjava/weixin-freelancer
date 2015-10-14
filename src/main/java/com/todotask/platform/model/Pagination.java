package com.todotask.platform.model;

import java.util.ArrayList;
import java.util.List;

public class Pagination<T> {
    // 当前页
    private int currentPage;

    // 共几页
    private int pageSize;

    // 总共记录条数
    private int totalSize;

    // 登录人,权限认证使用
    private String userName;

    // 结果集
    private List<T> resultList = new ArrayList<T>();

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
