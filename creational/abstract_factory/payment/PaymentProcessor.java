package creational.abstract_factory.payment;

public class PaymentProcessor {
    private PaymentGatewayFactory factory;

    public PaymentProcessor(PaymentGatewayFactory factory) {
        this.factory = factory;
    }

    void processPayment(double amount) {
        PaymentService paymentService = factory.createPayment();
        paymentService.pay(amount);
    }

    void processRefund(double amount) {
        RefundService refundService = factory.createRefund();
        refundService.refund(amount);
    }
}
