package StrategyDesignPattern.withStrategyPattern;

import StrategyDesignPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
