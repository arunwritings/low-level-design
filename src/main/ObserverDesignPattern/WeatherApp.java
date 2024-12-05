package ObserverDesignPattern;

import ObserverDesignPattern.concreteClasses.PhoneDisplay;
import ObserverDesignPattern.concreteClasses.TVDisplay;
import ObserverDesignPattern.concreteClasses.WeatherStation;
import ObserverDesignPattern.interfaces.Observer;

// Usage Class
public class WeatherApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);
        weatherStation.setWeather("Sunny");
    }

}
