package practs_koshynskyi.pract12_koshynskyi;

import java.math.BigDecimal;

public record Payment(Long id, String email, PaymentStatus status, BigDecimal amountCents) {
}
