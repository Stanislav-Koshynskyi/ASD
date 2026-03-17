package practs_koshynskyi.pract9_koshynskyi;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class Ticket {
    private final int priority;
    private final LocalDate createdAt;
    public Ticket(int priority, LocalDate createdAt) {
        this.priority = priority;
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "priority=" + priority + ", createdAt=" + createdAt;
    }

}
