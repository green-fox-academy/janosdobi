/*Exercise

Write a program where the program chooses a number between 1 and 100.
The player is then asked to enter a guess.
If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.

Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)*/

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Initializing range. Please set the lower limit: ");
        int lowerRange = input.nextInt();
        System.out.println("Please set the upper limit: ");
        int upperRange = input.nextInt();
        int number = rand.nextInt(upperRange) + lowerRange;

        for (int i = 5; i >= 1; i--) {
            System.out.println("Guess a number between " + lowerRange + " and " + upperRange);
            int guessNumber = input.nextInt();
            if(guessNumber != number) {
                System.out.println("Wrong! You have " + (i - 1) + " guess(es) left.");
            } else {
                System.out.println("Congratulations, you won!");
                break;
            }

        }
    }
}

