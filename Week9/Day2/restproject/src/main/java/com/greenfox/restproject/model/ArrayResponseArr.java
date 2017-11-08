package com.greenfox.restproject.model;

public class ArrayResponseArr {

    private Integer[] numbers;

    public ArrayResponseArr(Integer[] numbers) {
        this.numbers = getDouble(numbers);
    }

    public Integer[] getDouble(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : numbers) {
            sb.append(i + ", ");
        }
        sb.append("]");
        return sb.toString();
    }
}