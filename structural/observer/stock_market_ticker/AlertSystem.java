package structural.observer.stock_market_ticker;

public class AlertSystem implements Observer {

    @Override
    public void update(double price, String stock) {
        System.out.println("AlertSystem: " + stock + "-" + price);
    }

}
