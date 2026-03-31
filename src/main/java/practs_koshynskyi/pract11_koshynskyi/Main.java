package practs_koshynskyi.pract11_koshynskyi;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Clean Code", "Robert Martin", 2008, List.of("clean", "practice", "java")),
                new Book("Effective Java", "Joshua Bloch", 2018, List.of("java", "best", "api")),
                new Book("Modern Java", "Nicolai Parlog", 2020, List.of("java", "streams", "records")),
                new Book("Java Concurrency", "Brian Goetz", 2006, List.of("concurrency", "java"))
        );
        //Task 1
        List<String> booksFiltered = books.stream()
                .filter(b -> b.year() >= 2015)
                .map(b -> b.title().toUpperCase())
                .sorted()
                .limit(3)
                .toList();
        System.out.println(booksFiltered);
        //Task 2
        List<String> tags = books.stream()
                .flatMap(b -> b.tags().stream())
                .distinct()
                .sorted()
                .toList();
        Map<String, Long> tagFrequency = books.stream()
                .flatMap(b -> b.tags().stream())
                .collect(Collectors.groupingBy(tag -> tag, Collectors.counting()));
        System.out.println(tagFrequency);
        int n = 2;
        List<String> topTagFrequency = tagFrequency.keySet().stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return tagFrequency.get(o1).compareTo(tagFrequency.get(o2));
                    }
                }.reversed().thenComparing(
                        new Comparator<String>() {
                            public int compare(String o1, String o2) {
                                return o1.compareTo(o2);
                            }
                        }
                ))
                .limit(n)
                .toList();

        System.out.println(topTagFrequency);


        List<Sale> sales = List.of(
                new Sale("a@ex.com", "Tea", 120),
                new Sale("b@ex.com", "Cake", 200),
                new Sale("a@ex.com", "Tea", 120),
                new Sale("c@ex.com", "Coffee", 150),
                new Sale("b@ex.com", "Cake", 200)
        );


        Map<String, Integer> collect = sales.stream().collect(Collectors
                .toMap(Sale::product, Sale::cents,
                        Integer::sum));
        System.out.println(collect);

        Map<String, Long> customerEmail =
                sales.stream().collect(Collectors.groupingBy(
                        Sale::customerEmail, Collectors.counting()
                ));
        System.out.println(customerEmail);

        //task 4

        List<Result> results = List.of(new  Success("asd"), new Failure("qwe"), new Success("qwe"),
                new Failure("fail"), new Success("succ"));
        System.out.println(results.stream().filter(o -> o.getClass() == Success.class).count());
        List<String> allFail = results.stream().filter(o -> o.getClass() == Failure.class)
                .map(Result::getMassage)
                .toList();
        System.out.println(allFail);




        //task 5

        Map<Boolean, List<Book>> recentVsOld = books.stream()
                .collect(Collectors.partitioningBy(b -> b.year() > 2015, Collectors.toList()));
        System.out.println(recentVsOld);


        Map<String, Integer> sorted = sales.stream()
                .collect(Collectors.toMap(Sale::product, Sale::cents,
                        Integer::sum,
                        TreeMap::new));
        System.out.println(sorted);

    }
}


