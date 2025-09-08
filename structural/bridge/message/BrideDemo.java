package structural.bridge.message;

public class BrideDemo {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();

        TextMessage textSms = new TextMessage(smsSender);
        ImageMessage imageEmail = new ImageMessage(emailSender);

        textSms.send("Hello");
        imageEmail.send("hello.png");
    }
}
