package practs_koshynskyi.pract12_koshynskyi;

import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentReportWriter {
    public static void writeReport(Path out, List<Payment> payments){
        int invalidLines = 0;// нам вже список ніби передають
        BigDecimal paidTotalCent = BigDecimal.ZERO;
        Map<PaymentStatus, Integer> paymentStatuses = new HashMap<>();
        for (Payment payment : payments){
            paymentStatuses.put(payment.status(), paymentStatuses.getOrDefault(payment.status(), 0) + 1);
            paidTotalCent = paidTotalCent.add(payment.amountCents());
        }
        Path temp = Paths.get(out.toString() + ".tmp");

        try(BufferedWriter bw = Files.newBufferedWriter(temp,  StandardOpenOption.APPEND)){
            if (out.getParent() != null && out.getParent().toFile().exists()) {
                Files.createDirectories(out.getParent());
            }
            bw.write("invalid lines: " + invalidLines );
            bw.newLine();
            bw.write("paid total: " + paidTotalCent);
            bw.newLine();
            bw.write("NEW: " + paymentStatuses.get(PaymentStatus.NEW));
            bw.newLine();
            bw.write("PAID: " + paymentStatuses.get(PaymentStatus.PAID));
            bw.newLine();
            bw.write("FAIL: " + paymentStatuses.get(PaymentStatus.FAILED));
            Files.move(temp, out, StandardCopyOption.ATOMIC_MOVE);
        }catch (IOException e){
            System.out.println("error writing");
        }
    }
}
