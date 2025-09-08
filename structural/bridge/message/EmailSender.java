package structural.bridge.message;

public class EmailSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Sending email message...");
    }

}
