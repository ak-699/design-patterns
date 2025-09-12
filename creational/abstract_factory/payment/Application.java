package creational.abstract_factory.payment;

public class Application {
    public static void main(String[] args) {
        PaymentGatewayFactory factory = new StripePaymentGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(factory);
        paymentProcessor.processPayment(1000);
        paymentProcessor.processRefund(100);
    }
}
