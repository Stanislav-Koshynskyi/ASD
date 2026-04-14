package practs_koshynskyi.pract13_koshynskyi;

import javax.accessibility.AccessibleAction;

public class Task3 {
    public static void main(String[] args) {
        Account from = new Account(1L, 500.0);
        Account to = new Account(2L, 250.0);
        Thread thread1 = new Thread(() -> {
            TransferService.transfer(from, to, 100);
        });
        Thread thread2 = new Thread(() -> {
            TransferService.transfer(to, from, 200);
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1 ->" + from + ", 2 -> " + to);
    }
}
