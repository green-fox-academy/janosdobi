/*Create a function named search palindrome following your current language's style guide. It should take a string, search for palindromes that at least 3 characters long and return a list with the found palindromes.

Examples

input	output
"dog goat dad duck doodle never"	["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
"apple"	[]
"racecar"	["racecar"]
""	[]*/

import java.util.ArrayList;

public class PalindromeSearch {
    public static void main(String[] args) {

        System.out.println(searchPalindrome("dog goat dad duck doodle never"));

    }

    public static ArrayList searchPalindrome(String inputString) {


        ArrayList<String> inputArray = new ArrayList();
        ArrayList<String> outputArray = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 3; j <= inputString.length(); j++) {
                inputArray.add(inputString.substring(i, j));
            }
        }

        for (int i = 0; i < inputArray.size(); i++) {
            if(inputArray.get(i).equals(new StringBuilder(inputArray.get(i)).reverse().toString())) {
                outputArray.add(inputArray.get(i));
            }
        }
        return outputArray;
    }
}