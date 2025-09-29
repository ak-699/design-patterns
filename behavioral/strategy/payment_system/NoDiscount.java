package behavioral.strategy.payment_system;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {
        return amount;
    }

}
