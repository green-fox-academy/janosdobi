import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression: ");
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        String operator = expression.substring(0, 1);
        String firstNum = expression.substring(2, (expression.indexOf(" ", 2)));
        String secondNum = expression.substring((expression.indexOf(" ", 2) + 1), (expression.length()));

        int firstInt = Integer.parseInt(firstNum);
        int secondInt = Integer.parseInt(secondNum);

        double result = 0;
        if(operator.equals("+")) {
            result = firstInt + secondInt;
        } else if(operator.equals("-")) {
            result = firstInt - secondInt;
        } else if(operator.equals("/")) {
            result = firstInt / (double)secondInt;
        } else if(operator.equals("*")) {
            result = firstInt * secondInt;
        } else if(operator.equals("%")) {
            result = firstInt % secondInt;
        }

        System.out.println(firstInt);
        System.out.println(operator);
        System.out.println(secondInt);
        System.out.println("The result is: " + result);
    }
}