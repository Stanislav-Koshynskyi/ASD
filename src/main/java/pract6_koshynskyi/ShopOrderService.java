package pract6_koshynskyi;

public class ShopOrderService {
    ShopPaymentService shopPaymentService;
    public ShopOrderService(ShopPaymentService shopPaymentService) {
        this.shopPaymentService = shopPaymentService;
    }
    public void createOrder(String userEmail, String productName) {
    }
    public void payOrder(long orderId) {
        shopPaymentService.payOrder(orderId);
    }
}
