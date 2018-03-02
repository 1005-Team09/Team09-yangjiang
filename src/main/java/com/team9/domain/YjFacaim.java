package com.team9.domain;

/**
 * Created by dllo on 18/2/28.
 */

public class YjFacaim {
    private int aimId;
    private String aimName;
    private int facId;


    public YjFacaim() {
    }

    public YjFacaim(int aimId, String aimName, int facId) {
        this.aimId = aimId;
        this.aimName = aimName;
        this.facId = facId;
    }

    @Override
    public String toString() {
        return "YjFacaim{" +
                "aimId=" + aimId +
                ", aimName='" + aimName + '\'' +
                ", facId=" + facId +
                '}';
    }

}
