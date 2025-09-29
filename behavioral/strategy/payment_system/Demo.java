package behavioral.strategy.payment_system;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(1200);
        cart.addItem(500);
        cart.setDiscountStrategy(new FixedAmountDiscount(500));
        cart.setPaymentStrategy(new CreditCardPayment("abhishek", "1111", "111"));
        cart.checkOut();
    }
}
