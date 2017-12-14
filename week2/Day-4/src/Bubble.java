/*
Sort that list

        Create a function that takes a list of numbers as parameter
        Returns a list where the elements are sorted in ascending numerical order
        Make a second boolean parameter, if it's true sort that list descending
        Example

        input [34, 12, 24, 9, 5]
        output [5, 9, 12, 24, 34]
*/

import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(new Integer[] {34, 12, 24, 9, 5})));

    }

    public static Integer[] bubbleSort(Integer[] numbers) {
/*
        for(int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i -1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int c = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = c;
                }
            }
        }*/

        Collections.sort(Arrays.asList(numbers));

        return numbers;
    }
}
