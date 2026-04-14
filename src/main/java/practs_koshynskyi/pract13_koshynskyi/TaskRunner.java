package practs_koshynskyi.pract13_koshynskyi;

import java.util.ArrayList;
import java.util.List;

public class TaskRunner {
    public static final List<Order> orders = new ArrayList<>(List.of(
            new Order(1, 100), new Order(2, 50),
            new Order(3, 25), new Order(4, 66)
    ));
    public static void runAndWait(List<Runnable> runnables){
        List<Thread> threads = new ArrayList<>();
        for (Runnable runnable : runnables){
            threads.add(new Thread(runnable));
        }
        for (Thread thread : threads){
            thread.start();
        }
        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {}
        }
    }

}
