package pract2_koshynskyi;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        if (accountNumber == null || accountNumber.isEmpty()) throw new IllegalArgumentException("Номер аккаунту не може бути пустим");
        this.accountNumber = accountNumber;
        if (initialBalance < 0) throw new IllegalArgumentException("Баланс має бути невід'ємним");
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Депозит має бути невід'ємне");
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Зняття має бути невід'ємне");
        if (amount > balance) throw new NotEnoughFundsException("На балансі недостатньо коштів");
        balance -= amount;
    }

}
