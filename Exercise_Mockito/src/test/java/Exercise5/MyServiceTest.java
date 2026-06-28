package Exercise5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call")
                .thenReturn("Third Call");
        
//        Here, Mockito is instructed to return different values on consecutive calls:
        
        MyService service = new MyService(mockApi);

        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
        assertEquals("Third Call", service.fetchData());
        assertEquals("Third Call", service.fetchData());
        
//        After the last specified return value is reached, 
//       Mockito keeps returning the last value ("Third Call"). It does not restart from "First Call".
    }
}