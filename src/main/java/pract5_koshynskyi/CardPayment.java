package pract5_koshynskyi;

public class CardPayment implements PaymentMethod {

    @Override
    public void name() {
        System.out.println("card payment method name");
    }
    @Override
    public void pay(int amount) {
        System.out.println("card payment method payment amount, amount: " + amount);
    }
}
