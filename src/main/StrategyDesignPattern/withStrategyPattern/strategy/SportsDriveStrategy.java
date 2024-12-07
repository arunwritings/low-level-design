package StrategyDesignPattern.withStrategyPattern.strategy;

public class SportsDriveStrategy implements StrategyPattern {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
