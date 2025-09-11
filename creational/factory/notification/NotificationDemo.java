package creational.factory.notification;

public class NotificationDemo {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.notifyUser();
    }
}
