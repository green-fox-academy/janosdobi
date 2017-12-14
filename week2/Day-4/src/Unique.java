/*Unique - remove the duplicates

        Create a function that takes a list of numbers as a parameter
        Returns a list of numbers where every number in the list occurs only once
        Example

        input: [1, 11, 34, 11, 52, 61, 1, 34]
        output: [1, 11, 34, 52, 61]*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unique {
    public static void main(String[] args) {

        System.out.println(unifier(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34)));

    }

    public static List unifier (List<Integer> inputList) {

/*        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbersArrayList.contains(numbers[i])) {

            } else {
                numbersArrayList.add(numbers[i]);
            }
        }

        return numbersArrayList;*/

        return inputList.stream().filter(i -> inputList.contains(i)).collect(Collectors.toList());
    }
}
