package creational.factory.notification;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS NOTIFICATION.");
    }

}