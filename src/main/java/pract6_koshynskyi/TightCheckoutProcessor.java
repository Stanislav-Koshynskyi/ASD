package pract6_koshynskyi;

public class TightCheckoutProcessor {
    private final PaymentGateway gateway;
    private final NotificationService notifier;

    public TightCheckoutProcessor(PaymentGateway gateway, NotificationService notifier) {
        this.gateway = gateway;
        this.notifier = notifier;
    }

    public PaymentResult checkout(Order order, PaymentDetails details, Email email) {
        Money total = order.total();
        PaymentResult result = gateway.charge(total, details);
        if (result.isSuccess()) {
            notifier.sendReceipt(email, total);
        }
        return result;
    }
}
