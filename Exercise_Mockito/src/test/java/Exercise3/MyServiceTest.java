package Exercise3;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData(anyString())).thenReturn("Mock Data");
        
//        when() tells Mockito what should happen when a method is called.
//        anyString() means accept any String value.
//        thenReturn("Mock Data") tells Mockito to return "Mock Data".
        		
        MyService service = new MyService(mockApi);

        service.fetchData("Nithya");

        verify(mockApi).getData(anyString());
        
//        verify() checks whether the method was called.
//        anyString() means the method can be called with any String.
//
//        Mockito checks:
//
//        ✔ Was getData() called?
//
//        If yes → Test passes.
//
//        If not → Test fails.
    }
}
