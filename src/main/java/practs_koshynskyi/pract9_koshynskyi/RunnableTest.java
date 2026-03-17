package practs_koshynskyi.pract9_koshynskyi;

public class RunnableTest {
    public Runnable runOnce() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("runOnce");
            }
        };
    }
}