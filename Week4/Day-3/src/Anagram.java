import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    }

    public static boolean anagram(String firstString, String secondString) {

        if (firstString.length() != secondString.length()) {
            return false;
        }

        if (firstString.length() == 0 || secondString.length() == 0) {
            return false;
        }

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

        return Arrays.equals(firstArray, secondArray);
    }
}
