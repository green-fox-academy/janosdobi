// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
    public static void main(String[] args) {

        Counter (6);

    }

    public static int Counter(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        Counter(n - 1);
        return 0;
    }
}
