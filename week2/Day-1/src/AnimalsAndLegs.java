import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have

    System.out.println("Please enter the number of chickens: ");

    Scanner input = new Scanner(System.in);
    int numChicken = input.nextInt();

    System.out.println("Please enter the number of pigs: ");
    int numPig = input.nextInt();

    System.out.println("The total number of animal legs on the farm is " + ((numChicken * 2) + (numPig * 4)));

  }
}
