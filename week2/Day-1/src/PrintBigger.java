// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        float numberOne = input.nextFloat();
        float numberTwo = input.nextFloat();

        if(numberOne > numberTwo){
            System.out.println(numberOne);
        } else {
            System.out.println((int) (numberTwo));
        }

    }
}