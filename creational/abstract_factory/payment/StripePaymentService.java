package creational.abstract_factory.payment;

public class StripePaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("STRIPE PAYMENT.");
    }

}
