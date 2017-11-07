package com.greenfox.restproject.model;

public class ReturnArray {

    private Integer[] numbers;

    public ReturnArray(Integer[] numbers) {
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
}
