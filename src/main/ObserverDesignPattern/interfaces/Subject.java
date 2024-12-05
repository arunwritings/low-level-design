package ObserverDesignPattern.interfaces;

import ObserverDesignPattern.interfaces.Observer;

public interface Subject {  // Subject Interface

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
