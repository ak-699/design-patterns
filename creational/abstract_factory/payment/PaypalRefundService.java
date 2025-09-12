package creational.abstract_factory.payment;

public class PaypalRefundService implements RefundService {

    @Override
    public void refund(double amount) {
        System.out.println("PAYPAL REFUND.");
    }

}
