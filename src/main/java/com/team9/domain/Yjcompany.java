package com.team9.domain;

import java.io.Serializable;

/**
 * Created by dllo on 18/3/1.
 */

public class Yjcompany implements Serializable {
    private int comId;
    private String comName;

    public Yjcompany() {
    }

    public Yjcompany(int comId, String comName) {
        this.comId = comId;
        this.comName = comName;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }
}
