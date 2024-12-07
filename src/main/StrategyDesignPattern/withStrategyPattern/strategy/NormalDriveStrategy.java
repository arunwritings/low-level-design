package StrategyDesignPattern.withStrategyPattern.strategy;

public class NormalDriveStrategy implements StrategyPattern {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
