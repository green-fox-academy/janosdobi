package com.greenfox.colors;

public class RedColor implements MyColor {

    private String color;

    public RedColor() {
        this.color = "red";
    }

    @Override
    public void printColor() {
        System.out.printf("It is %s in color...", color);
        System.out.println();
    }
}
