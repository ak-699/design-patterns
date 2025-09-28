package structural.observer.stock_market_ticker;

public interface Observer {
    void update(double price, String stock);
}
