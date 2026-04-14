package practs_koshynskyi.pract13_koshynskyi;

import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        TaskRunner.runAndWait(
                List.of(
                        new Runnable() {
                            @Override
                            public void run() {
                                int max = 0;
                                for (Order o : TaskRunner.orders) {
                                    max = Math.max(max, o.totalCents());
                                }
                                System.out.println("Максиум - " + max);
                            }
                        }, new Runnable() {
                            @Override
                            public void run() {
                                int sum = 0;
                                for (Order o : TaskRunner.orders) {
                                    sum += o.totalCents();
                                }
                                System.out.println("sum - " + sum);

                            }
                        }
                )
        );
    }
}
