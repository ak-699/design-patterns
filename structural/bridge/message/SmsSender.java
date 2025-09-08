package structural.bridge.message;

public class SmsSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Sending sms message...");
    }

}
