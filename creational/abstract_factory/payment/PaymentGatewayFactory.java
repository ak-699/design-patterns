package creational.abstract_factory.payment;

public interface PaymentGatewayFactory {
    PaymentService createPayment();

    RefundService createRefund();
}
