package structural.observer.weather_station;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
