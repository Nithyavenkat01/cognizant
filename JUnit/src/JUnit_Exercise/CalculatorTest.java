package JUnit_Exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator c = new Calculator();

        int result = c.add(2, 3);
        

        System.out.println("Result = " + result);
        assertEquals(5, result);
    }
}