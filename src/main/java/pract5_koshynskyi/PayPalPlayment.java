package pract5_koshynskyi;

public class PayPalPlayment implements  PaymentMethod {
    @Override
    public void name() {
        System.out.println("PayPal name");
    }
    @Override
    public void pay(int amount) {
        System.out.println("PayPal pay, amount: " + amount);
    }
}
