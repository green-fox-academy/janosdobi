/*Find part of an integer

Create a function that takes two strings as a parameter
Returns the starting index where the second one is starting in the first one
Returns -1 if the second string is not in the first one
Example

input: "this is what I'm searching in", "searching"
output: 17*/

public class Substr {
    public static void main(String[] args) {

        System.out.println(stringSlicer("this is what I'm searching in", "searching"));

    }

    public static int stringSlicer (String longString, String shortString) {

        if(longString.contains(shortString)) {
            return longString.indexOf(shortString);
        } else {
            return -1;
        }

    }

}
