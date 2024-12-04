package strategyDesignPattern.withStrategyPattern;

import strategyDesignPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
