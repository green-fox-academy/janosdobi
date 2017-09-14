// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        int temp = line;
        int stars = 1;

        for (int i = 1; i <= line/2; i++) {
            for (int j = 1; j <= temp - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
            stars += 2;
            temp--;
        }

        for (int i = line/2; i <= line; i++) {
            for (int j = 1; j <= temp - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
            stars -= 2;
            temp++;
        }
    }
}