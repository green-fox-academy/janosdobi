// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= number; i++) {
            System.out.println("Please enter an integer: ");
            sum += input.nextInt();
        }

        System.out.println("Sum: " + sum + ", Average: " + (float) (sum/number));
    }
}
