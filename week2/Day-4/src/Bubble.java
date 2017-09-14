/*
Sort that list

        Create a function that takes a list of numbers as parameter
        Returns a list where the elements are sorted in ascending numerical order
        Make a second boolean parameter, if it's true sort that list descending
        Example

        input [34, 12, 24, 9, 5]
        output [5, 9, 12, 24, 34]
*/


import java.util.ArrayList;

public class Bubble {
    public static void main(String[] args) {

        System.out.println(bubbleSort(new int[] {34, 12, 24, 9, 5}));

    }

    public static ArrayList bubbleSort(int[] numbers) {

        int c = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i -1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    c = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = c;
                }
            }
        }

        ArrayList<Integer> numbersArray = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersArray.add(numbers[i]);

        }

        return numbersArray;
    }

}
