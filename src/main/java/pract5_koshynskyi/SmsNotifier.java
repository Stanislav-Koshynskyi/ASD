package pract5_koshynskyi;

public interface SmsNotifier {
    default void send(String message) {
        System.out.println("SMS: " + message);
    }
    default void delete(String message) {
        System.out.println("DELETE: " + message);
    }
    default void edit(String incomingMessage, String message) {
        System.out.println("EDIT: " + message + "to: " + incomingMessage);
    }
}
