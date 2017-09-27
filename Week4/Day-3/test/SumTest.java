import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sum() throws Exception {
        Sum a = new Sum();
        a.sumArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(1 + 2 + 3 + 4 + 5, a.sum());
    }

    @Test
    public void sumZero() throws Exception {
        Sum a = new Sum();
        a.sumArray = new ArrayList<>(Arrays.asList());
        assertEquals(0, a.sum());
    }

    @Test
    public void sumNull() throws Exception {
        Sum a = new Sum();
        a.sumArray = new ArrayList<>(Arrays.asList(2));
        assertEquals(2, a.sum());
    }

}