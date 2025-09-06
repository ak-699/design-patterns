package structural.observer.weather_station;

public class ObserverDemo {
    public static void main(String[] args) {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.setMeasurements(100, 10, 743);
    }
}
