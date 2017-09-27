import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    @Test
    public void SharpieColor() throws Exception {
        Sharpie test = new Sharpie("red", 4.9f);
        assertEquals("red", test.color);
    }

    @Test
    public void SharpieWidth() throws Exception {
        Sharpie test = new Sharpie("red", 4.9f);
        assertTrue(4.9f == test.width);
    }

    @Test
    public void setEmpty() throws Exception {
        Sharpie test = new Sharpie();
        assertTrue(0f == test.width);
    }

    @Test
    public void setWidth() throws Exception {
        Sharpie test = new Sharpie("blue", 5.8f);
        assertTrue(5.8f == test.width);
    }

    @Test
    public void use() throws Exception {
        Sharpie test = new Sharpie();
        test.use();
        assertTrue(95 == test.inkAmount);
    }

}