package practs_koshynskyi.pract9_koshynskyi;

import java.util.Comparator;

public class TicketComparators {
    public static class ComparatorByPriority implements Comparator<Ticket> {
        @Override
        public int compare(Ticket o1, Ticket o2) {
            return o1.getPriority() - o2.getPriority();
        }
    }
    public static class ComparatorByCreatedAt implements Comparator<Ticket> {
        @Override
        public int compare(Ticket o1, Ticket o2) {
            return o1.getCreatedAt().compareTo(o2.getCreatedAt());
        }
    }
    public static Comparator<Ticket> getByPriority() {
        return new ComparatorByPriority();
    }
    public static Comparator<Ticket> getByCreatedAt() {
        return new ComparatorByCreatedAt();
    }
    public static Comparator<Ticket> getByPriorityAndCreatedAt() {
        return new ComparatorByPriority().thenComparing(new ComparatorByCreatedAt());
    }
}
