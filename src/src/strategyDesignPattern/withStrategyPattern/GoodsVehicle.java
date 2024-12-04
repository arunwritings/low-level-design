package strategyDesignPattern.withStrategyPattern;

import strategyDesignPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
