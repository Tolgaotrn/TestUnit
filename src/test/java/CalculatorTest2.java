import org.example.Calculator2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {
    @Test
    public void testArea() {
        Calculator2 calculate = new Calculator2();
        int area = calculate.area(3,5);
        int area2 = calculate.area(5,8);
        int area3 = calculate.area(2,4);
        int perimeter1 = calculate.perimeter(3,5);
        int perimeter2 = calculate.perimeter(5,8);
        int perimeter3 = calculate.perimeter(2,4);
        int expected1 = 15;
        int expected2 = 40;
        int expected3 = 8;
        int expected4 = 16;
        int expected5 = 26;
        int expected6 = 12;

        assertEquals(area, expected1);
        assertEquals(area2, expected2);
        assertEquals(area3, expected3);
        assertEquals(perimeter1, expected4);
        assertEquals(perimeter2, expected5);
        assertEquals(perimeter3, expected6);
    }

}
