package behavioral.strategy.payment_system;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Double> prices = new ArrayList<>();
    PaymentStrategy paymentStrategy;
    DiscountStrategy discountStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void addItem(double amount) {
        prices.add(amount);
    }

    void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    void checkOut() {
        double totalAmount = prices.stream().mapToDouble(Double::doubleValue).sum();
        totalAmount = discountStrategy.applyDiscount(totalAmount);
        if (paymentStrategy == null) {
            System.out.println("No payment method selected");
        } else {
            paymentStrategy.pay(totalAmount);
        }
    }
}
