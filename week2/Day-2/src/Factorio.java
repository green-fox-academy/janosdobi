//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.stream.IntStream;

public class Factorio {
    public static void main(String[] args) {

        System.out.println(factorio(9));

    }

    public static int factorio(int p) {
        /*int fact = 1;
        for (int i = 1; i <= p; i++) {
            fact *= i;
        }
        return fact;*/

        return IntStream.rangeClosed(2, p).reduce(1, (x, y) -> x * y);
    }
}
