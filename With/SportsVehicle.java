package StrategyPatterns.With;

import StrategyPatterns.With.Strategy.SportyStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportyStrategy());
    }
}
