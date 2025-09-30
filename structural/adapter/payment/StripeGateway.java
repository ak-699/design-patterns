package structural.adapter.payment;

public class StripeGateway {
    void makePayment(double amount) {
        System.out.println("Stripe payment: " + amount);
    }
}
