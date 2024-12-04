package strategyDesignPattern.withStrategyPattern.strategy;

import strategyDesignPattern.withStrategyPattern.strategy.StrategyPattern;

public class NormalDriveStrategy implements StrategyPattern {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
