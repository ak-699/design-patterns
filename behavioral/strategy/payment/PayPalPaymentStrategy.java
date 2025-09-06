package behavioral.strategy.payment;

public class PayPalPaymentStrategy implements PaymentStrategy {
    private String email;

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " from: " + email);
    }

}
