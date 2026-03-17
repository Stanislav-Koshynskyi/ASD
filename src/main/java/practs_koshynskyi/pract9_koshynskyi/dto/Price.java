package practs_koshynskyi.pract9_koshynskyi.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;

@Value
@AllArgsConstructor
public class Price {
    BigDecimal amount;
}
