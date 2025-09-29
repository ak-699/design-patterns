package behavioral.strategy.payment_system;

import java.util.Arrays;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String name, String cardNumber, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paying via credit card: " + Arrays.asList(name, cardNumber, cvv).toString() + " amount=" + amount);
    }

}
