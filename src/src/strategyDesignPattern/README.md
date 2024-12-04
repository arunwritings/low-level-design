Strategy Pattern in System Design

Overview
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime.
It defines a family of algorithms, encapsulates each one, and makes them interchangeable.
This promotes flexibility and scalability in system design by adhering to the Open/Closed Principle and Single Responsibility Principle.

In the context of vehicles, different types of vehicles like SportsVehicle, OffRoadVehicle, and GoodsVehicle have distinct driving behaviors.
Instead of hardcoding these behaviors into the vehicle classes, the Strategy Pattern helps to encapsulate them, allowing dynamic behavior assignment and reducing code duplication.