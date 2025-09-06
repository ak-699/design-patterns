package behavioral.strategy.payment;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1111-2222-3333-4444"));
        cart.checkout(3999);
    }
}
