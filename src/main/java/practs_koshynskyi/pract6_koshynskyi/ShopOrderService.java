package practs_koshynskyi.pract6_koshynskyi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
