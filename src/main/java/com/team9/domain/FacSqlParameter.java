package com.team9.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/3/1.
 */

public class FacSqlParameter implements Serializable {
    private String facName;
    private int pageIndex;
    private int pageSize;

    public FacSqlParameter() {
    }

    public FacSqlParameter(String facName, int pageIndex, int pageSize) {
        this.facName = facName;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "FacSqlParameter{" +
                "facName='" + facName + '\'' +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
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
