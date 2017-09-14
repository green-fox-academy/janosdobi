// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();

        for (int i = 1 ; i <= line ; i++) {
            for (int j = 1 ; j < line ; j++ )
                System.out.print(" ");
            line--;

            for (int j = 1 ; j <= 2*i - 1 ; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

