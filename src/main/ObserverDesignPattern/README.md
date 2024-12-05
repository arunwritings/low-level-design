Observer Design Pattern

The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects.
When one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.
It primarily deals with the interaction and communication between objects, specifically focusing on how objects behave in response to changes in the state of other objects.

Below are some key points about observer design pattern:

1. Defines how a group of objects (observers) interact based on changes in the state of a subject.
2. Observers react to changes in the subject’s state.
3. The subject doesn’t need to know the specific classes of its observers, allowing for flexibility.
4. Observers can be easily added or removed without affecting the subject.

Components of Observer Design Pattern

Subject:
 - The subject maintains a list of observers (subscribers or listeners).
 - It Provides methods to register and unregister observers dynamically and defines a method to notify observers of changes in its state.
Observer:
 - Observer defines an interface with an update method that concrete observers must implement and ensures a common or consistent way for concrete observers to receive updates from the subject.
ConcreteSubject:
 - ConcreteSubjects are specific implementations of the subject. They hold the actual state or data that observers want to track. When this state changes, concrete subjects notify their observers.
 - For instance, if a weather station is the subject, specific weather stations in different locations would be concrete subjects.
ConcreteObserver:
 - Concrete Observer implements the observer interface. They register with a concrete subject and react when notified of a state change.
 - When the subject’s state changes, the concrete observer’s update() method is invoked, allowing it to take appropriate actions.
 - For example, a weather app on your smartphone is a concrete observer that reacts to changes from a weather station.