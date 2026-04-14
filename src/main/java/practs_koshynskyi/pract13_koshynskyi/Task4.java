package practs_koshynskyi.pract13_koshynskyi;

import java.util.concurrent.ConcurrentHashMap;

public class Task4 {
    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        TicketQueue ticketQueue = new TicketQueue();
        Runnable produser = new Runnable() {
            @Override
            public void run() {
                ticketQueue.add(new SupportTicket(1, "a", "a"));
                ticketQueue.add(new SupportTicket(2, "b", "b"));
                ticketQueue.add(new SupportTicket(3, "c", "c"));
                ticketQueue.add(new SupportTicket(4, "d", "d"));
                ticketQueue.add(TicketQueue.POISON_PILL);
                ticketQueue.add(TicketQueue.POISON_PILL);
                ticketQueue.add(TicketQueue.POISON_PILL);
                ticketQueue.add(TicketQueue.POISON_PILL);
            }
        };
        Runnable consumer = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
