/*Find the substring in the list

Create a function that takes a string and a list of string as a parameter
Returns the index of the string in the list where the first string is part of
Returns -1 if the string is not part any of the strings in the list
Example

input: "ching", ["this", "is", "what", "I'm", "searching", "in"]
output: 4*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class substrlist {
    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
        System.out.println(stringInList("ching", A));

    }

    public static int stringInList(String inputString, ArrayList<String> inputArray) {

        int output = -1;
        for (int i = 0; i < inputArray.size(); i++) {
            if (inputArray.get(i).contains(inputString)) {
                output = inputArray.indexOf(inputArray.get(i));
            }
        }
        return output;
    }
}
