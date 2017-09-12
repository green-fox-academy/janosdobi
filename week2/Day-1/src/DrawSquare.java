// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int multiplier = input.nextInt();

        for (int i = 1; i <= multiplier; i++) {
            for(int j = 1; j <= multiplier; j++) {
                if (i == multiplier || j == multiplier || i == 1 || j == 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}
