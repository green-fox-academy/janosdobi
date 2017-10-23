package com.greenfox;

public class Car {

    private Type carType;
    private Color color;

    public Car() {
        carType = Type.randomType();
        color = Color.randomColor();
    }

    public Type getType() {
        return carType;
    }

    public Color getColor() {
        return color;
    }
}
