import org.example.Calculator3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest3 {
    @Test
    public void testIsTriangle() {
        Calculator3 calculate = new Calculator3();
        boolean isTriangle = calculate.isTriangle(3,4,5);
        boolean isTriangle2 = calculate.isTriangle(5,8,12);
        boolean isTriangle3 = calculate.isTriangle(2,4,6);
        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = false;

        assertEquals(isTriangle, expected1);
        assertEquals(isTriangle2, expected2);
        assertEquals(isTriangle3, expected3);
    }
}
