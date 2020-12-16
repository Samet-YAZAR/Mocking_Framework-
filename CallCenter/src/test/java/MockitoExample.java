import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoExample {

    @Test
    public void test(){
        List<String> mocklist = mock(List.class);
        mocklist.add("First");
        when(mocklist.get(0)).thenReturn("Mockito");
        when(mocklist.get(1)).thenReturn("JCG");
        assertEquals("Mockito",mocklist.get(0));
        assertEquals("JCG",mocklist.get(1));
    }
}
