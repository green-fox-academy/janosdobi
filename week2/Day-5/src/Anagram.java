/*Create a function named is anagram following your current language's style guide. It should take two strings and return a boolean value depending on whether its an anagram or not.

Examples

input 1	input 2	output
"dog"	"god"	true
"green"	"fox"	false*/


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class Anagram {
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

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if(Arrays.equals(firstArray, secondArray)) {
            output = true;
        }

        return output;
    }
}


