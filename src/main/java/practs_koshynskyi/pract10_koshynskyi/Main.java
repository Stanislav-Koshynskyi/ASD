package practs_koshynskyi.pract10_koshynskyi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Event event = new Event("event1",
                LocalDateTime.of(2020, 10, 10, 10, 5),
                ZoneOffset.ofHours(+3),
                Duration.ofMinutes(20),
                "32 cab");
        Event event1 = new Event("event2",
                LocalDateTime.of(2020, 10, 10, 10, 15),
                ZoneOffset.ofHours(+2),
                Duration.ofMinutes(25),
                "33 cab");
        Event event2 = new Event("event1",
                LocalDateTime.of(2022, 9, 8, 5, 25),
                ZoneOffset.ofHours(+3),
                Duration.ofMinutes(15),
                "34 cab");
        System.out.println(EventLab.findConflicts(List.of(event, event1, event2)));
        System.out.println(EventLab.minutesBetween(event1, event2));
        System.out.println(EventLab.toInstant(event));
        System.out.println(EventLab.startInZone(event2, "+2"));
    }
}
