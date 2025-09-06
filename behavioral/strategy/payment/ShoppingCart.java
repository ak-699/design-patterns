package behavioral.strategy.payment;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(float total) {
        if (paymentStrategy == null) {
            System.out.println("Select a payment method: ");
        }
        paymentStrategy.pay(total);
    }
}
