package structural.observer.weather_station;

public interface Subject {
    void registerObserver(Observer o);

    void deregisterObserver(Observer o);

    void notifyObserevers();
}
