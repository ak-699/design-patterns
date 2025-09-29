package behavioral.strategy.payment_system;

public class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * (1 - percentage / 100);
    }

}
