package creational.abstract_factory.payment;

public class StripePaymentGateway implements PaymentGatewayFactory {

    @Override
    public PaymentService createPayment() {
        return new StripePaymentService();
    }

    @Override
    public RefundService createRefund() {
        return new StripeRefundService();
    }

}
