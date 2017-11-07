package com.greenfox.restproject.model;

public class DoUntil {

    private int result;

    public DoUntil() {}

    public DoUntil(String method, Until until) {
        if (method.equals("sum")) {
            result = sum(until.getUntil());
        } else if (method.equals("factor")) {
            result = factor(until.getUntil());
        }
    }

    public int sum(int number) {
        int result = 0;
        for (int j = 1; j <= number; j++) {
            result += j;
        }
        return result;
    }

    public int factor(int number) {
        int result = 1;
        for (int j = 1; j <= number ; j++) {
            result *= j;
        }
        return result;
    }

    public int getResult() {
        return result;
    }
}