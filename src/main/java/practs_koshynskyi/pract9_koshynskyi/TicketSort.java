package practs_koshynskyi.pract9_koshynskyi;

import java.util.Comparator;
import java.util.List;

public class TicketSort {
    public List<Ticket> sortByPriorityInAnonim(List<Ticket> tickets) {
        return tickets.stream().sorted(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getPriority() - o2.getPriority();
            }
        }).toList();
    }
    public List<Ticket> sortByDateInAnonim(List<Ticket> tickets) {
        return tickets.stream().sorted(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getCreatedAt().compareTo(o2.getCreatedAt());
            }
        }).toList();
    }
    public List<Ticket> sortByPriorityInLambda(List<Ticket> tickets) {
        return tickets.stream().sorted((o1, o2) -> Comparator.comparing(Ticket::getPriority).compare(o1, o2)).toList();
    }
    public List<Ticket> sortByDateInLambda(List<Ticket> tickets) {
        return tickets.stream().sorted(
            Comparator.comparing(Ticket::getCreatedAt).reversed()
        ).toList();
    }
}
