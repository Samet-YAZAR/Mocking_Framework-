import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculateServiceTest {
    CalculatorService cservice;

    @Before
    public void set(){
        ICalculator cal = mock(ICalculator.class);
        when(cal.add(3,3)).thenReturn(6);
        cservice = new CalculatorService();
        cservice.setCal(cal);
    }
    @Test
    public void testaddTwoNumbers(){
        assertEquals(6,cservice.addTwoNumbers(3,3));
    }
}
