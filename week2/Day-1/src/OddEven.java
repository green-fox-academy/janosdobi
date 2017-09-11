// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.

import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


