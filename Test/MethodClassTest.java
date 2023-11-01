import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MethodClassTest {

    MethodClass methodClass = new MethodClass();

    @Test
    public void test_multiplyTwoNumbers(){
        int result = methodClass.multiplyTwoNumbers(40, 8);
        Assertions.assertEquals(result, 320);
    }
}