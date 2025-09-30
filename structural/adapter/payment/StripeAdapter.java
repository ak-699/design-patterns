package structural.adapter.payment;

public class StripeAdapter implements PaymentProcessor {
    StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Adapter");
        stripeGateway.makePayment(amount);
    }

}
