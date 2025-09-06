package behavioral.state.atm;

public class HasCardState implements State {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.setState(new IdleState());
    }

    @Override
    public void withdraw(ATM atm, double amount) {
        System.out.println("Enter pin.");
    }

    @Override
    public void refill(ATM atm, double amount) {
        System.out.println("Refilling ATM with amount=" + amount);
        atm.setCash(atm.getCash() + amount);
    }

    @Override
    public void enterPin(ATM atm, int pin) {
        if (pin == atm.getPin()) {
            System.out.println("Enter amount to withdraw: ");
            atm.setState(new PinEntered());
        } else {
            System.out.println("Wrong pin. Try again!");
        }
    }

}
