import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci() throws Exception {
        ArrayList<Integer> fiboNumbers = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        int n = 5;
        assertEquals((int) fiboNumbers.get(n), Fibonacci.fibonacci(n));
    }

    @Test
    public void fibonacciZero() throws Exception {
        ArrayList<Integer> fiboNumbers = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));
        int n = 0;
        assertEquals((int) fiboNumbers.get(n), Fibonacci.fibonacci(n));
    }



}