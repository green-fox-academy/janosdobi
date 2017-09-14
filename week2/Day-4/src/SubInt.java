/*Find the part of int

Create a function that takes a number and a list of numbers as a parameter
Returns the indeces of the numbers in the list where the first number is part of
Returns an empty list if the number is not part any of the numbers in the list
Example

input: [1, 11, 34, 52, 61], 1
output: [0, 1, 4]*/

import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
        System.out.println(intIdentifier(A, 1));

    }

    public static ArrayList intIdentifier(ArrayList<Integer> numbersArray, int number) {

        ArrayList<String> stringArray = new ArrayList<>();
        ArrayList<Integer> outputArray = new ArrayList<>();
        for (int i = 0; i < numbersArray.size(); i++) {
            stringArray.add(numbersArray.get(i).toString());
            if (stringArray.get(i).contains("" + number)) {
                outputArray.add(stringArray.indexOf(stringArray.get(i)));
            }
        }
        return outputArray;
    }
}
