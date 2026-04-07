package practs_koshynskyi.pract12_koshynskyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class PaymentLoader {
    public static List<Payment> load(Path path) {
        List<Payment> payments = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8 )){
            bufferedReader.readLine();
            bufferedReader.lines().forEach(line -> {
                try {
                    String[] split = line.split(",");
                    if (split.length != 4) throw new IllegalArgumentException("Invalid line");
                    payments.add(new Payment(Long.valueOf(split[0]),
                            split[1], PaymentStatus.valueOf(split[2])
                            , BigDecimal.valueOf(Long.parseLong(split[3]))));
                }catch (Exception e){}
            });
        }catch (IOException e){
            System.out.println("Error reading file");
        }
        return payments;
    }
    public static Tuple<List<Payment>, Integer> loadWithStats(Path path) {
        List<Payment> payments = new ArrayList<>();
        AtomicInteger i = new AtomicInteger(0);
        try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8 )){
            bufferedReader.readLine();

            bufferedReader.lines().forEach(line -> {
                try {
                    String[] split = line.split(",");
                    if (split.length != 4) throw new IllegalArgumentException("Invalid line");
                    payments.add(new Payment(Long.valueOf(split[0]),
                            split[1], PaymentStatus.valueOf(split[2])
                            , BigDecimal.valueOf(Long.parseLong(split[3]))));
                }catch (Exception e){
                    i.incrementAndGet();
                }
            });
        }catch (IOException e){
            System.out.println("Error reading file");
        }
        return new Tuple<>(payments, i.get());
    }
}