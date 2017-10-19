public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(3, 4));
        System.out.println(calc.subtract(3, 3));
        System.out.println(calc.multiply(3, 3));
        System.out.println(calc.divide(3, 0));
    }
}
