//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter

import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(6));

    }

    public static int sum(int p) {
/*        int sum = 0;
        for(int i = 1; i <= p; i++) {
            sum += i;
        }*/
        return IntStream.rangeClosed(1, p).sum();
    }
}
