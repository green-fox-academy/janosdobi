package com.greenfox.restproject.model;

public class ArrayHandler {

    private String what;
    private Integer[] numbers;

    public ArrayHandler(String what, Integer[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ArrayHandler() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

}
