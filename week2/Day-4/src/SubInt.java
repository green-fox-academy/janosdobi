/*Find the part of int

Create a function that takes a number and a list of numbers as a parameter
Returns the indeces of the numbers in the list where the first number is part of
Returns an empty list if the number is not part any of the numbers in the list
Example

input: [1, 11, 34, 52, 61], 1
output: [0, 1, 4]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubInt {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
        System.out.println(intIdentifier(A, 1));

    }

    public static List intIdentifier(ArrayList<Integer> numbers, int number) {

        ArrayList<String> strings = new ArrayList<>();

        numbers.forEach(n -> strings.add(n.toString()));
        return strings.stream()
                .filter(s -> s.contains(Integer.toString(number)))
                .map(s -> strings.indexOf(s))
                .collect(Collectors.toList());

/*        ArrayList<Integer> outputArray = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (strings.get(i).contains("" + number)) {
                outputArray.add(strings.indexOf(strings.get(i)));
            }
        }
        return outputArray;*/
    }
}
