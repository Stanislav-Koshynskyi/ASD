package practs_koshynskyi.pract7_koshynskyi;

import java.math.BigDecimal;

public class OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    public OrderService() {}
    public Order createOrder(Long id, String email, BigDecimal cent) {

        return new Order(id, email, cent);

    }
    public Order checkout(Order order) {

        try {
            throw new OrderProcessingException("Checking out order");
        } catch (OrderProcessingException e) {
            log.warn("Order processing failed, {} - order id, {} - user email", order.id(), order.userEmail());
        }
        return order;
    }
}
