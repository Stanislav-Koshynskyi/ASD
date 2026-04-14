package practs_koshynskyi.pract13_koshynskyi;

public class TransferService {
    public static void transfer(Account from, Account to, double amount) {
        synchronized (from.getId())  {
            synchronized (to.getId()) {
                from.subtract(amount);
                to.add(amount);
            }
        }
    }
}
