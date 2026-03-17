package practs_koshynskyi.pract9_koshynskyi;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        RunnableTest runnableTest = new RunnableTest();
        Runnable runnable = runnableTest.runOnce();
        runnable.run();
        runnable.run();
         */
        TicketService ticketService = new TicketService();
        System.out.println(ticketService.buildTicketId("base"));
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, LocalDate.now()));
        tickets.add(new Ticket(3, LocalDate.now()));
        tickets.add(new Ticket(2, LocalDate.of(2027, 10, 10)));
        tickets.add(new Ticket(1, LocalDate.of(2020, 10, 10)));
        tickets = tickets.stream().sorted(TicketComparators.getByCreatedAt()).toList();
        tickets.forEach(System.out::println);
        tickets = tickets.stream().sorted(TicketComparators.getByCreatedAt()).toList();
        tickets.forEach(System.out::println);
        tickets =  tickets.stream().sorted(TicketComparators.getByPriorityAndCreatedAt()).toList();
        tickets.forEach(System.out::println);

    }
}
