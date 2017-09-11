// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int number = 8;
        boolean userGuess = false;

        while(userGuess == false) {
            System.out.println("Please enter a number: ");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();

            if (guess < number) {
                System.out.println("The stored number is higher. Guess again!");
            } else if(guess > number) {
                System.out.println("The stored number is lower. Guess again!");
            } else {
                System.out.println("You found the number: 8");
                userGuess = true;
            }
        }
    }
}