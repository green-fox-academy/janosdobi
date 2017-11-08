package com.greenfox.guardians.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Cargo {

    private String received;
    private Integer amount;
    private String shipStatus;
    private boolean ready;

    public Cargo(String received, Integer amount) {
        this.received = received;
        this.amount = amount;
        this.shipStatus = shipStatusChecker(amount);
        this.ready = setStatus(amount);
    }

    private String shipStatusChecker(Integer amount) {
        Integer ratio =  amount / 12500 * 100;
        if (ratio < 100) {
            return String.valueOf(ratio) + "%";
        } else if (ratio == 0) {
            return "empty";
        } else if(ratio == 100) {
            return "full";
        } else {
            return "overloaded";
        }
    }

    private boolean setStatus(Integer amount) {
        if (amount == 12500) {
            return true;
        } else {
            return false;
        }
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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