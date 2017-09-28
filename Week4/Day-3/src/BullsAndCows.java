import java.util.ArrayList;
import java.util.Scanner;

public class BullsAndCows {

    protected ArrayList<Integer> numberDigits;
    protected int count;

    public BullsAndCows() {

        numberDigits = new ArrayList<>();
        numberDigits.add((int) (1 + Math.random() * 9));
        while (numberDigits.size() < 4) {
            int temp = (int) (Math.random() * 10);
            if (!numberDigits.contains(temp)) {
                numberDigits.add(0, temp);
            }
        }
        count = 5;
    }

    public ArrayList<Integer> getGuessDigits() {
        System.out.println("Enter a 4-digit number: ");
        Scanner input = new Scanner(System.in);
        int guess = (input.nextInt());
        ArrayList<Integer> guessDigits = new ArrayList<>();
        while (guess > 0) {
            guessDigits.add(guess % 10);
            guess /= 10;
        }
        return guessDigits;
    }

    public void game(ArrayList<Integer> number, ArrayList<Integer> guess) {
        int bull = 0;
        int cow = 0;
        if (number.equals(guess)){
            System.out.println("Congratulations, You won!");
            count = 0;
        } else {
            for (int i = 0; i < guess.size(); i++) {
                if (guess.get(i) == number.get(i)) {
                    bull++;
                } else if (number.contains(guess.get(i))) {
                    cow++;
                }
            }
            count--;
            System.out.println("You have guessed " + bull + " bull(s), and " + cow + " cows. You have " + count + " guess(es) left.");
        }
        if(count == 0) {
            System.out.println("You lose :( Thank you for playing!");
        }
    }
}