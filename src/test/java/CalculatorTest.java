import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CalculatorTest {
    @Test
    public void testSum ( ) {
        Calculator calculation = new Calculator ( ) ;
        int sum = calculation.sum ( 2 , 5 ) ;
        int testSum = 6 ;
        assertEquals ( sum , testSum ) ;
    }



}

