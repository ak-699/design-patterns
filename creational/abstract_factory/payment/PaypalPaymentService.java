package creational.abstract_factory.payment;

public class PaypalPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("PAYPAL PAYMENT.");
    }

}
