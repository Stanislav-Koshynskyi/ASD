package practs_koshynskyi.pract15_koshynskyi;

public class CardPaymentService implements  PaymentService {
    @Override
    public String pay() {
        return "pay for card";
    }
}
