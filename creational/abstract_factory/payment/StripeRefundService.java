package creational.abstract_factory.payment;

public class StripeRefundService implements RefundService {

    @Override
    public void refund(double amount) {
        System.out.println("STRIPE REFUND.");
    }

}
