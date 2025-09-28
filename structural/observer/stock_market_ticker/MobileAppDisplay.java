package structural.observer.stock_market_ticker;

public class MobileAppDisplay implements Observer {

    @Override
    public void update(double price, String stock) {
        System.out.println("MobileAppDisplay: " + stock + "-" + price);
    }

}
