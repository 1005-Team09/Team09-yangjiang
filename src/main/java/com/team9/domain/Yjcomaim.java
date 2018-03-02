package com.team9.domain;

/**
 * Created by dllo on 18/3/1.
 */

public class Yjcomaim {
    private int comaimId;
    private String comaimName;
    private int comId;

    public Yjcomaim() {
    }

    public Yjcomaim(int comaimId, String comaimName, int comId) {
        this.comaimId = comaimId;
        this.comaimName = comaimName;
        this.comId = comId;
    }

    public int getComaimId() {

        return comaimId;
    }

    public void setComaimId(int comaimId) {
        this.comaimId = comaimId;
    }

    public String getComaimName() {
        return comaimName;
    }

    public void setComaimName(String comaimName) {
        this.comaimName = comaimName;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }
}
