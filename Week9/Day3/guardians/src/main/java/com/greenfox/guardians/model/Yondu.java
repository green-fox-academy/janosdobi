package com.greenfox.guardians.model;

public class Yondu {

    private long distance;
    private long time;
    private long speed;

    public Yondu(long distance, long time) {
        this.distance = distance;
        this.time = time;
        this.speed = this.distance / this.time;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }
}
