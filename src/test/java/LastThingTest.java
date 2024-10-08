import org.example.Student;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class LastThingTest {
    @BeforeAll
    public static void onceExecutedBeforeAll () {
        System. out .println ( "Test Student Class" ) ;
    }
    @BeforeEach
    public void setup () {
        int first = 15;
        int second = 23;

    }
    @Test
    public void testGivenMethod() {
        int expected = 19;
        assertEquals(expected, 19);
    }
}
