import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MethodClassTest {

    MethodClass methodClass = new MethodClass();

    @Test
    public void test_divideTwoNumbers(){
        int result = methodClass.divideTwoNumbers(40, 8);
        Assertions.assertEquals(result, 5);
    }
}