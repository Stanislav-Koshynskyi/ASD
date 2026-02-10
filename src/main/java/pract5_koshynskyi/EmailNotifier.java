package pract5_koshynskyi;

public interface EmailNotifier {
    default void send(String message) {
        System.out.println("Email: " + message);
    }
}
