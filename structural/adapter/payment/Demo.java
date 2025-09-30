package structural.adapter.payment;

public class Demo {
    public static void main(String[] args) {
        CheckoutService checkoutService1 = new CheckoutService(new PayPalGateway());
        CheckoutService checkoutService2 = new CheckoutService(new StripeAdapter(new StripeGateway()));

        checkoutService1.checkout(99);
        checkoutService2.checkout(99);
    }
}
