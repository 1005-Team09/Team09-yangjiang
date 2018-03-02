package com.team9.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/2/28.
 */

public class YjFactory implements Serializable {
    private int facId;
    private String facName;

    public YjFactory() {
    }

    public YjFactory(int facId, String facName) {
        this.facId = facId;
        this.facName = facName;
    }

    @Override
    public String toString() {
        return "YjFactory{" +
                "facId=" + facId +
                ", facName='" + facName + '\'' +
                '}';
    }

    public int getFacId() {
        return facId;
    }

    public void setFacId(int facId) {
        this.facId = facId;
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }
}
