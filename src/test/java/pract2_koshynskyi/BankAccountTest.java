package pract2_koshynskyi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount bankAccount;
    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("123", 200);
    }
    @Test
    void depositShouldIncreaseBalance() {
        bankAccount.deposit(100);
        Assertions.assertEquals(300, bankAccount.getBalance());
    }
    @Test
    void exceptionWhenNegativeDeposit() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-100));
    }
    @Test
    void withdrawShouldDecreaseBalance() {
        bankAccount.withdraw(100);
        Assertions.assertEquals(100, bankAccount.getBalance());
    }
    @Test
    void exceptionWhenNegativeWithdraw() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-100));
    }
    @Test
    void exceptionWhenWithdrawMoreThanBalance() {
        Assertions.assertThrows(NotEnoughFundsException.class, () -> bankAccount.withdraw(300));
    }
}
