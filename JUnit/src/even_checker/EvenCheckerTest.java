package even_checker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();
    
    @ParameterizedTest  // Run the same test method multiple times using different input values."
//    Normally, we write a test like this:
//    	@Test
//    	void testEven() {
//    	    assertTrue(checker.isEven(2));
//    	}
//    	This only tests one value (2).
//    	If you also want to test 4, 6, 8, and 10, you would have to write many test methods. 
    	
    @ValueSource(ints = {2, 4, 6, 8, 10}) // @ValueSource supplies the input values to the parameterized test.
    void testEvenNumbers(int number) {
        assertTrue(checker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testOddNumbers(int number) {
        assertFalse(checker.isEven(number));
    }
}