public class TechStarterBank {

    private final double balance = 12000.0 - 50;

    public double sendMoney(int amountToSend) throws Exception {
        if (amountToSend > balance) {
            throw new Exception("Insufficient Balance");
        }
        double total = balance - amountToSend;
        System.out.println("Amount transferred successfully and your balance is " + total);
        return total;
    }
}