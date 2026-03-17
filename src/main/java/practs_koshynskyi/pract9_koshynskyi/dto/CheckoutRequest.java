package practs_koshynskyi.pract9_koshynskyi.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Builder
@Data
public class CheckoutRequest {
    private String username;
    private BigDecimal amount;
    private Long orderId;
    private LocalDate orderDate;
}
