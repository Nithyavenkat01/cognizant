package Exercise4;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doNothing().when(mockApi).sendData();
//        This tells Mockito:
//        	"When sendData() is called, do nothing." - no return type
        
        MyService service = new MyService(mockApi);

        service.process();

        verify(mockApi).sendData();
    }
}