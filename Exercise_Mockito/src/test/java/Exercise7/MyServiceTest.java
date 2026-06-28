package Exercise7;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethodException() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doThrow(new RuntimeException("API Error"))
                .when(mockApi)
                .sendData();
        
//        This tells Mockito:
//        	"Whenever sendData() is called, throw a RuntimeException with the message API Error."
        	
        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.process();
        });

        verify(mockApi).sendData();
    }
}
