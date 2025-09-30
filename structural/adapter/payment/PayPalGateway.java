package structural.adapter.payment;

public class PayPalGateway implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paypal payment: " + amount);
    }

}
