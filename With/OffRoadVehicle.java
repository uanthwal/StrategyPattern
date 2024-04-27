package StrategyPatterns.With;

import StrategyPatterns.With.Strategy.SportyStrategy;

public class OffRoadVehicle extends Vehicle{
     
    OffRoadVehicle() {
        super(new SportyStrategy());
    }
}
