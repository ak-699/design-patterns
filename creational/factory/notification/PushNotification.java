package creational.factory.notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("PUSH NOTIFICATION.");
    }

}
