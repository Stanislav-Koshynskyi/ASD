package practs_koshynskyi.pract13_koshynskyi;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TicketQueue {
    public static final SupportTicket POISON_PILL = null;
    private final BlockingQueue<SupportTicket> queue = new LinkedBlockingQueue<>();
    public void TicketQueue() {
    }
    public void add(SupportTicket ticket) {
        try {
            queue.put(ticket);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public SupportTicket take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            return null;
        }
    }

}
