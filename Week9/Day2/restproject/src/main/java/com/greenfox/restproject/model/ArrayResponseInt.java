package com.greenfox.restproject.model;

public class ArrayResponseInt {

    private int result;

    public ArrayResponseInt(String what, Integer[] numbers) {
        if (what.equals("sum")) {
            result = sum(numbers);
        } else if (what.equals("multiply")) {
            result = multiply(numbers);
        }
    }

    public int sum(Integer[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public int multiply(Integer[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.valueOf(result);
    }

}
