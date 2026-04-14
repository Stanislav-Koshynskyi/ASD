package practs_koshynskyi.pract13_koshynskyi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account{
    private Long id;
    private Double balance;
    public void add(double balance) {
        this.balance = this.balance + balance;
    }
    public void subtract(double balance) {
        this.balance = this.balance - balance;
    }
}
