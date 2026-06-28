package Exercise6;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.execute();

        InOrder inOrder = Mockito.inOrder(mockApi);
        
//        Explanation
//        InOrder tells Mockito:
//        "I want to verify the sequence of method calls on this mock object."
//        Without InOrder, Mockito only checks whether methods were called, not the order.
        
        inOrder.verify(mockApi).login();
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).logout();
    }
}
