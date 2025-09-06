package behavioral.state.atm;

public interface State {
    void insertCard(ATM atm);

    void ejectCard(ATM atm);

    void withdraw(ATM atm, double amount);

    void refill(ATM atm, double amount);

    void enterPin(ATM atm, int pin);
}
