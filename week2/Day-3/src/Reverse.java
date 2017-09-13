public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        char[] myArray = new char[reversed.length()];
        myArray = reversed.toCharArray();
        char[] newArray = new char[reversed.length()];

        int j = 0;
        for(int i = myArray.length - 1; i >= 0; i--) {
            newArray[j] = myArray[i];
            j++;
            }
        System.out.println(newArray);
    }
}