/*Write a simple program to check if a given number is an armstrong number.
The program should ask for a number.
E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numLength = String.valueOf(number).length();
        ArrayList<Integer> numberArray = new ArrayList<>();

        int temp = number;
        while(temp > 0) {
            numberArray.add(temp % 10);
            temp /= 10;
        }

        int sum = 0;
        for (int i = 0; i < numberArray.size(); i++) {
            sum += (Math.pow(numberArray.get(i), numLength));
        }

        if(number == sum) {
            System.out.println("The " + number + " is an Armstrong number!");
        } else {
            System.out.println("The number is not an Armstrong number!");
        }
    }
}

