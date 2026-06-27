package Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Assert_Exercise {
	
	@Test
	public void testAssertion() {
		// TODO Auto-generated method stub
		assertEquals(5,2+3);
		
		System.out.print("Result");

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);
        
        assertNotNull(new Object());
	}

}
