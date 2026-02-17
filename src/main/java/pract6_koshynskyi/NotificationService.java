package pract6_koshynskyi;
public interface NotificationService<Target> {
    void sendReceipt(Target target,Money total);
}
