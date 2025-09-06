package behavioral.state.atm;

public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.setCash(1000);
        atm.insertCard();
        atm.withdraw(5);
        atm.enterPin(1234);
        atm.withdraw(5);
        System.out.println("Current balance: " + atm.getCash());
        atm.withdraw(10);
    }
}
