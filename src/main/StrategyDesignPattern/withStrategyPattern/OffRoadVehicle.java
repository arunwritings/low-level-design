package StrategyDesignPattern.withStrategyPattern;

import StrategyDesignPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
