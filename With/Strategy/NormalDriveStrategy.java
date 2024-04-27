package StrategyPatterns.With.Strategy;

public class NormalDriveStrategy implements IDriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
    
}
