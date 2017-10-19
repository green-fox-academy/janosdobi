public class Calculator {

    public <T extends Number> Double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public <T extends Number> Double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public <T extends Number> Double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public <T extends Number> Double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
}