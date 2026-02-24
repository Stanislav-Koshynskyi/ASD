package practs_koshynskyi.pract7_koshynskyi;


import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(OrderService.class);
        Order order1 = new Order(2L, "as@as.as", BigDecimal.valueOf(1));
        try{
            Order order2 = new Order(0L, "as@as.as", BigDecimal.valueOf(1));
        }catch (IllegalArgumentException e){
            System.out.println("invalid argument");
        }


        OrderService  orderService = new OrderService();
        orderService.checkout(order1);


        try(ReceiptWriter receiptWriter = new ReceiptWriter()){
            receiptWriter.generate();
        }catch (ReceiptGenerationException e){
            System.out.println(e.getMessage());
        }
        logger.error("timeout");
    }
}
