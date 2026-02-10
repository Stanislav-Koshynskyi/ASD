package pract5_koshynskyi;

public interface PaymentMethod {
    void name();
    void pay(int amount);

    // default
    default void payWithFee(int amount, int fee){
        pay(amount + fee);
    }
}
