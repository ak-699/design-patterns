package structural.adapter.payment;

public class CheckoutService {
    PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    void checkout(double amount) {
        System.out.println("Checking out with amount = " + amount);
        paymentProcessor.pay(amount);
    }
}
