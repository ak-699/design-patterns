package structural.bridge.message;

public class ImageMessage extends Message {

    public ImageMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.send(message);
    }

}
