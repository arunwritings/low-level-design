package ObserverDesignPattern.concreteClasses;

import ObserverDesignPattern.interfaces.Observer;

// ConcreteObserver Class
public class PhoneDisplay implements Observer {

    private String weather;

    @Override
    public void update(String Weather) {
        this.weather = Weather;
        display();
    }

    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
