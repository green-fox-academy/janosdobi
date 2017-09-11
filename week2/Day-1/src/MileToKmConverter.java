import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    System.out.println("Distance in km/s: ");
    Scanner input = new Scanner(System.in);
    double distanceKm = input.nextInt();
    System.out.println("The value you have entered equals to " + (distanceKm * 0.621371) + " miles");

  }
}
