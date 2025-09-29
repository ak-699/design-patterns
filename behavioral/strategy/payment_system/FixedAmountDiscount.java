package behavioral.strategy.payment_system;

public class FixedAmountDiscount implements DiscountStrategy {
    private double discountAmount;

    public FixedAmountDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        return Math.max(0, amount - discountAmount);
    }

}
