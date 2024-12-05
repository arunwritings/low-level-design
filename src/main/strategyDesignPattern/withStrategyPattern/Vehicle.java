package strategyDesignPattern.withStrategyPattern;

import strategyDesignPattern.withStrategyPattern.strategy.StrategyPattern;

public class Vehicle {

    StrategyPattern strategyPattern;

    Vehicle(StrategyPattern strategyPattern) {
        this.strategyPattern = strategyPattern;
    }

    public void drive() {
        strategyPattern.drive();
    }
}
