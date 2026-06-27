package even_checker;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();

    @Test
    void testPerformance() {

        assertTimeout(Duration.ofSeconds(2), () -> {
            tester.performTask();
        });
        
        
//        This test checks:
//        	"Can performTask() finish within 2 seconds?"
//        	If yes → ✅ Test Passed
//        	If no → ❌ Test Failed
//        	This is called Timeout Testing or Performance Testing.

    }
}