import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TechStarterBankTest {

    TechStarterBank techStarterBankTest = new TechStarterBank();

    @Test
    public void test_sendMoney() throws Exception {
        double amountResult = techStarterBankTest.sendMoney(1000);
        Assertions.assertEquals(amountResult, 10950.0);
    }
}
