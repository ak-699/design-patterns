package structural.observer.stock_market_ticker;

public interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
