package structural.observer.stock_market_ticker;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer alertSystem = new AlertSystem();
        Observer mobileAppDisplay = new MobileAppDisplay();
        Observer statisticsTracker = new StatisticsTracker();
        StockMarket sm = new StockMarket();
        sm.addObserver(alertSystem);
        sm.addObserver(mobileAppDisplay);
        sm.addObserver(statisticsTracker);

        sm.updateStockAndPrice(99, "AMZN");
    }
}
