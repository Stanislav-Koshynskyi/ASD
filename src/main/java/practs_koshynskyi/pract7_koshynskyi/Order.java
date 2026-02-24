package practs_koshynskyi.pract7_koshynskyi;

import java.math.BigDecimal;

public record Order(Long id, String userEmail, BigDecimal totalCent ) {
    public Order{
        if (id == null || userEmail == null || totalCent == null) {
            throw new IllegalArgumentException("fields cannot be null");
        }
        if (id <= 0){
            throw new IllegalArgumentException("id cannot be negative or zero");
        }
        if (! userEmail.contains("@")){
            throw new IllegalArgumentException("userEmail must contain @");
        }
        if (!(totalCent.compareTo(BigDecimal.ZERO) > 0)) {
            throw new IllegalArgumentException("totalCent cannot be negative");
        }
    }
}
