package behavioral.state.atm;

public class OutOfCashState implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("No cash!");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No cash!");
    }

    @Override
    public void withdraw(ATM atm, double amount) {
        System.out.println("No cash!");
    }

    @Override
    public void refill(ATM atm, double amount) {
        System.out.println("Refilling ATM with amount=" + amount);
        atm.setCash(amount);
        atm.setState(new IdleState());
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("No cash!");
    }

}
