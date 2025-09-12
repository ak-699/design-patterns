package creational.abstract_factory.payment;

public class PaypalPaymentGateway implements PaymentGatewayFactory {

    @Override
    public PaymentService createPayment() {
        return new PaypalPaymentService();
    }

    @Override
    public RefundService createRefund() {
        return new PaypalRefundService();
    }

}
