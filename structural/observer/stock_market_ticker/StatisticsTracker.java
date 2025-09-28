package structural.observer.stock_market_ticker;

public class StatisticsTracker implements Observer {

    @Override
    public void update(double price, String stock) {
        System.out.println("StatisticsTracker: " + stock + "-" + price);
    }

}
