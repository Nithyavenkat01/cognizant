package even_checker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class) // Normally,JUnit does not guarantee the order in which test methods are executed.
// so to control the order 
//We use
//@TestMethodOrder(OrderAnnotation.class)
//It tells JUnit:
//"Run the test methods according to their @Order values."

public class OrderedTests {

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("First Test Executed");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("Second Test Executed");
        assertEquals(4, 2 + 2);
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("Third Test Executed");
        assertFalse(5 < 3);
    }
}