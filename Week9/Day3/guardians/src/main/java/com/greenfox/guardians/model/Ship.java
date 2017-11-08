package com.greenfox.guardians.model;

public class Ship {

    private long caliber25;
    private long caliber30;
    private long caliber50;
    private String shipStatus;
    private boolean ready;

    public Ship() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipStatus = "empty";
        this.ready = false;
    }

    public long getCaliber25() {
        return caliber25;
    }

    public void setCaliber25(long caliber25) {
        this.caliber25 = caliber25;
    }

    public long getCaliber30() {
        return caliber30;
    }

    public void setCaliber30(long caliber30) {
        this.caliber30 = caliber30;
    }

    public long getCaliber50() {
        return caliber50;
    }

    public void setCaliber50(long caliber50) {
        this.caliber50 = caliber50;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}