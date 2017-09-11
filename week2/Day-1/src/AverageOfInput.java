// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five whole numbers: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        int fourthNum = input.nextInt();
        int fifthNum = input.nextInt();

        float average = (float) ((firstNum + secondNum + thirdNum + fourthNum + fifthNum) / 5);

        System.out.println("Sum: " + (firstNum + secondNum + thirdNum + fourthNum + fifthNum) + ", Average; " + average);

    }

}


