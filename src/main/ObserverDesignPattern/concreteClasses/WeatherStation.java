package ObserverDesignPattern.concreteClasses;

import ObserverDesignPattern.interfaces.Observer;
import ObserverDesignPattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject Class
public class WeatherStation implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}
