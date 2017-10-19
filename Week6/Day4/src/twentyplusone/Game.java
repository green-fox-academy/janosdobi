package twentyplusone;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Deck mydeck = new Deck();
        int opponentScore = generateOpponentsScore();
        boolean gameStatus = true;

        while(gameStatus) {
            System.out.println("The sum of your cards is: " + mydeck.getCardSum() + ". Do you want to pull another? (Y/N)");
            if (myScanner.next().equals("Y")) {
                mydeck.pullLast();
                int input = mydeck.pullLast().getCardRank().getRank();
                mydeck.setCardSum(input + mydeck.getCardSum());
            } else if (myScanner.next().equals("N")) {
                gameStatus = false;
            }

            if (mydeck.getCardSum() > 21) {
                gameStatus = false;
            }
        }

        if (opponentScore > mydeck.getCardSum() || mydeck.getCardSum() > 21) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }

    }

    public static int generateOpponentsScore() {
        return (int) (15 + Math.random() * 21);
    }
}