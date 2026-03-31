package practs_koshynskyi.pract10_koshynskyi;

import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EventLab {
    public static Predicate<Event> predicate = new Predicate<Event>() {
        @Override
        public boolean test(Event event) {
            return (event.getStartTime().getHour() < 12);
        }
    };
    public static Predicate<Event> predicate2 = new Predicate<Event>(){

        @Override
        public boolean test(Event event) {
            return (event.getStartTime().getYear() == 2026);
        }
    };
    public static Predicate<Event> predicate3 = predicate.and(predicate2);
    public static List<Event> pick (List<Event> events, Predicate<Event> filter) {
        return events.stream().filter(filter).toList();
        /*
        for Event i: events{
            if (filter.test(events))
                filtered.add(i)
        }
         */
    }
    public static List<String> labels (List<Event> events, Function<Event, String > mapper) {
        return events.stream().map(mapper).toList();
    }
    /*
    for Event e: events{
        filtered.add (mapper.apply(e))
    }
     */
    public static void notifyAll (List<Event> events, Consumer<Event> consumer) {
        events.forEach(consumer);
    }
    public static Optional<Event> create (Supplier<Event> supplier) {
        return Optional.ofNullable(supplier.get());
    }
    /*
    public List<Event> filter (List<Event> events, List<Predicate<Event>> filters) {
    }

     */
    public static List<List<Event>> findConflicts(List<Event> events){
        List<List<Event>> list = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            for (int j = i + 1; j <  events.size(); j++) {
                Event first = events.get(i);
                Event second = events.get(j);
                boolean conflict = false;
                if (!first.getStartTime().isBefore(second.getStartTime()) && !first.getStartTime().isAfter(second.end())){
                    conflict = true;
                    }
                else if (!first.end().isBefore(second.getStartTime()) && !first.end().isAfter(second.end()))
                    conflict = true;
                else if (first.getStartTime().isAfter(second.getStartTime()) && first.end().isBefore(second.end())) {
                    conflict = true;
                }
                else if (!first.getStartTime().isBefore(second.getStartTime()) && !first.end().isAfter(second.end())) {}
                if (conflict){
                    list.add(List.of(first, second));
                }
            }
        }
        return list;
    }
    public static List<Event> sortByAnonim(List<Event> events){
        return events.stream().sorted(new Comparator<Event>() {

            @Override
            public int compare(Event o1, Event o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        }).toList();
    }
    public static List<Event> sortByLambda(List<Event> events) {
        return events.stream().sorted((o1, o2) -> o1.getStartTime().compareTo(o2.getStartTime())).toList();
    }
    public static List<Event> sortByMethodReference(List<Event> events) {
        return events.stream().sorted(byStartTime::compare).toList();
    }
    public static Comparator<Event> byStartTime = new Comparator<Event>() {
        @Override
        public int compare(Event o1, Event o2) {
            return o1.getStartTime().compareTo(o2.getStartTime());
        }
    };
    public static Instant toInstant(Event e){
        return e.getStartTime().toInstant(e.getZone());
    }
    public static Duration minutesBetween(Event e1, Event e2) {
        return Duration.between(e1.getStartTime(), e2.end());
    }
    public static LocalDateTime startInZone(Event e, String zone) {
        return toInstant(e).atZone(ZoneId.of(zone)).toLocalDateTime();

    }

}
