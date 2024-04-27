package StrategyPatterns.With.Strategy;

public class SportyStrategy implements IDriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sporty drive capability");
    }
    
}
