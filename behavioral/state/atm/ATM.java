package behavioral.state.atm;

public class ATM {
    private State state;
    private double cash;
    private int pin;

    public ATM() {
        this.state = new IdleState();
        this.cash = 0;
        this.pin = 1234;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public double getCash() {
        return cash;
    }

    public int getPin() {
        return pin;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void insertCard() {
        state.insertCard(this);
    }

    public void withdraw(double amount) {
        state.withdraw(this, amount);
    }

    public void enterPin(int pin) {
        state.enterPin(this, pin);
    }

}
