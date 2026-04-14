package practs_koshynskyi.pract13_koshynskyi;

public class Task2 {
    public static void main(String[] args) {
        int unsaveLessThenZero = 0;
        for (int i = 0; i < 2000; i ++){
            Inventory unsafe = new UnsafeInventory(100);
            Thread thread = new Thread(() -> {
                unsafe.reserve(60);
            });
            Thread thread2 = new Thread(() -> {
                unsafe.reserve(60);
            });
            thread.start();
            thread2.start();
            try {
                thread.join();
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if  (unsafe.available() < 0) unsaveLessThenZero++;
        }
        System.out.println(unsaveLessThenZero);
        int saveLessThenZero = 0;
        for (int i = 0; i < 2000; i ++){
            Inventory safe = new SynchronizedInventory(100);
            Thread thread = new Thread(() -> {
                safe.reserve(60);
            });
            Thread thread2 = new Thread(() -> {
                safe.reserve(60);
            });
            thread.start();
            thread2.start();
            try {
                thread.join();
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if  (safe.available() < 0) saveLessThenZero++;
        }
        System.out.println(saveLessThenZero);
    }

}
