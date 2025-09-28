package structural.observer.stock_market_ticker;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    List<Observer> observers = new ArrayList<>();
    double price;
    String stock;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (var o : observers) {
            o.update(price, stock);
        }
    }

    void updateStockAndPrice(double price, String stock) {
        this.price = price;
        this.stock = stock;
        notifyObservers();
    }

}
