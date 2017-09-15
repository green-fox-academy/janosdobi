/*Create a function named create palindrome following your current language's style guide.
It should take a string, create a palindrome from it and then return it.

input	output
""	""
"greenfox"	"greenfoxxofneerg"
"123"	"123321"*/


import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeBuild {
    public static void main(String[] args) {

        System.out.println(createPalindrome("dog"));

    }

    public static String createPalindrome(String inputString) {

        ArrayList<Character> inputArray = new ArrayList<>();
        ArrayList<Character> outputArray = new ArrayList<>();
        String outputString = inputString;

        for (int i = 0; i < inputString.length(); i++) {
            inputArray.add(inputString.charAt(i));
        }

        int j = 0;
        for (int i = inputArray.size()-1; i >= 0; i--) {
            outputArray.add(j, inputArray.get(i));
            j++;
        }

        for (int i = 0; i < outputArray.size(); i++) {
            outputString = outputString.concat("" + outputArray.get(i));
        }
        return outputString;
    }
}