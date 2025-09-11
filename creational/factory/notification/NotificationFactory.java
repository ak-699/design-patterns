package creational.factory.notification;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        Notification notification = null;
        switch (type) {
            case "email":
                notification = new EmailNotification();
                break;
            case "sms":
                notification = new SmsNotification();
                break;
            case "push":
                notification = new PushNotification();
                break;

            default:
                break;
        }
        return notification;
    }
}
