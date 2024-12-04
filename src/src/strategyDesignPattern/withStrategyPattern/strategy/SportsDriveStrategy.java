package strategyDesignPattern.withStrategyPattern.strategy;

import strategyDesignPattern.withStrategyPattern.strategy.StrategyPattern;

public class SportsDriveStrategy implements StrategyPattern {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
