
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void positive()
    {
        Calculator c = new Calculator();
        assertEquals( 3, c.add(1,2) );
        assertEquals( 4, c.minus(6,2) );
        assertEquals( 12, c.multiply(6,2) );
        assertEquals( 12, c.divide(24,2) );
    }

    @Test
    public void negative()
    {
        Calculator c = new Calculator();
        assertNotEquals(3, c.add(3,3));
        assertNotEquals(6, c.minus(4,2));
    }
}


