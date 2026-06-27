package arrange_act_assert;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    // Setup method - runs before every test
    @BeforeEach
    public void setUp() {
        System.out.println("Setup: Creating Calculator Object");
        calculator = new Calculator();
    }

    // Test Addition (AAA Pattern)
    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    // Test Subtraction (AAA Pattern)
    @Test
    public void testSubtraction() {

        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(5, result);
    }

    // Test Multiplication (AAA Pattern)
    @Test
    public void testMultiplication() {

        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(50, result);
    }

    // Test Division (AAA Pattern)
    @Test
    public void testDivision() {

        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(2, result);
    }

    // Teardown method - runs after every test
    @AfterEach
    public void tearDown() {
        System.out.println("Teardown: Test Completed");
    }
}
