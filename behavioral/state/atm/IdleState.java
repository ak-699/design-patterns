package behavioral.state.atm;

public class IdleState implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card entered");
        atm.setState(new HasCardState());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card to eject.");
    }

    @Override
    public void withdraw(ATM atm, double amount) {
        System.out.println("Insert card first.");
    }

    @Override
    public void refill(ATM atm, double amount) {
        System.out.println("Refilling ATM with amount=" + amount);
        atm.setCash(atm.getCash() + amount);
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Enter card first");
    }

}
