package com.greenfox.restproject.model;

public class DoUntilRequest {

    private Integer until;

    public DoUntilRequest(Integer until) {
        this.until = until;
    }

    public DoUntilRequest() {}

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
