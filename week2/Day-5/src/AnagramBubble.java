/*Create a function named is anagram following your current language's style guide. It should take two strings and return a boolean value depending on whether its an anagram or not.

Examples

input 1	input 2	output
"dog"	"god"	true
"green"	"fox"	false*/

import java.util.Arrays;

public class AnagramBubble {
    public static void main(String[] args) {

        System.out.println(anagram("dog", "god"));

    }

    public static boolean anagram(String firstString, String secondString) {


        boolean output = false;
        char[] firstArray = new char[firstString.length()];
        char[] secondArray = new char[secondString.length()];

        for (int i = 0; i < firstString.length(); i++) {
            firstArray[i] = firstString.charAt(i);
        }

        for (int i = 0; i < secondString.length(); i++) {
            secondArray[i] = secondString.charAt(i);
        }

        char c = 0;
        for(int i = 0; i < firstArray.length - 1; i++) {
            for (int j = 0; j < firstArray.length - i -1; j++) {
                if (firstArray[j] > firstArray[j + 1]) {
                    c = firstArray[j];
                    firstArray[j] = firstArray[j + 1];
                    firstArray[j + 1] = c;
                }
            }
        }

        char d = 0;
        for(int i = 0; i < secondArray.length - 1; i++) {
            for (int j = 0; j < secondArray.length - i -1; j++) {
                if (secondArray[j] > secondArray[j + 1]) {
                    d = secondArray[j];
                    secondArray[j] = secondArray[j + 1];
                    secondArray[j + 1] = d;
                }
            }
        }

        if(Arrays.equals(firstArray, secondArray)) {
            output = true;
        }

        return output;
    }
}