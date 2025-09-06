package behavioral.state.atm;

public class PinEntered implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.setState(new IdleState());
    }

    @Override
    public void withdraw(ATM atm, double amount) {
        if (atm.getCash() - amount > 0) {
            System.out.println("Withdrawing amount: " + amount);
            atm.setCash(atm.getCash() - amount);
        } else {
            System.out.println("Low balance. Cannot withdraw specified amount.");
        }
        atm.setState(new HasCardState());
    }

    @Override
    public void refill(ATM atm, double amount) {
        System.out.println("Refilling ATM with amount=" + amount);
        atm.setCash(atm.getCash() + amount);
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Pin already entered.");
    }

}
