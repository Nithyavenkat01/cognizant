package even_checker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    ExceptionThrower obj = new ExceptionThrower();

    @Test
    
//    This annotation tells JUnit:
//    "This method is a test case. Run it when executing JUnit tests."
//    Without @Test, JUnit ignores this method.
    
    void testException() {

        ArithmeticException exception = assertThrows( //assertThrows() checks whether a method throws the expected exception.
        		// syntax
//        		assertThrows(
//        			    ExpectedException.class,
//        			    () -> methodCall()
//        			);
        		
                ArithmeticException.class,
                () -> obj.throwException()
        );

        assertEquals("Arithmetic Exception Occurred", exception.getMessage());
    }
}