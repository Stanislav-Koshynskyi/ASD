package pract5_koshynskyi;

public class MultiNotifier implements SmsNotifier, EmailNotifier {
    public MultiNotifier() {}
    @Override
    public void send(String message) {
        SmsNotifier.super.send(message);
        EmailNotifier.super.send(message);
    }
}
