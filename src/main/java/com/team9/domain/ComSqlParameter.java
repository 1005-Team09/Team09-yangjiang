package com.team9.domain;

/**
 * Created by dllo on 18/3/1.
 */

public class ComSqlParameter {
    private String comName;
    private int pageIndex;
    private int pageSize;

    public ComSqlParameter() {
    }

    public ComSqlParameter(String comName, int pageIndex, int pageSize) {
        this.comName = comName;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
