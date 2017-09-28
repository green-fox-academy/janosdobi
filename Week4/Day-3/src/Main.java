public class Main {
    public static void main(String[] args) {

        System.out.println("Let's play cows and bulls!\n" +
                "For every digit you've guessed correctly in the correct place, you get a “bull”.\n" +
                "For every digit you've guessed correctly in the wrong place you get a “cow.”");

        BullsAndCows myGame = new BullsAndCows();
        while (0 < myGame.count) {
            myGame.game(myGame.numberDigits, myGame.getGuessDigits());
        }
    }
}
