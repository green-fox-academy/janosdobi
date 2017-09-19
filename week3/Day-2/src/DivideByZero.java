// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {

        tenDivider(0);

    }
    public static void tenDivider(int divisor) {

        try {
            System.out.println(10 / divisor);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }

    }
}
