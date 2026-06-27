package even_checker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, cal.add(4, 6));
    }
}