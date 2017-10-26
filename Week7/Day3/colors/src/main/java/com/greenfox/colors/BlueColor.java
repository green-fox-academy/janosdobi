package com.greenfox.colors;

public class BlueColor implements MyColor {

    private String color;

    public BlueColor() {
        this.color = "blue";
    }

    @Override
    public void printColor() {
        System.out.printf("It is %s in color...", color);
        System.out.println();
    }
}
