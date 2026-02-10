package pract5_koshynskyi;

public interface SmsNotifier {
    default void send(String message) {
        System.out.println("SMS: " + message);
    }
}
