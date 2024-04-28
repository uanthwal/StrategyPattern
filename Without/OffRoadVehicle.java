package StrategyPatterns.Without;

public class OffRoadVehicle extends Vehicle{
    @Override
    void drive() {
        boolean hasEngine = true;
        boolean hasManualTransmission = true;
        System.out.println("Display features");
        System.out.println("hasEngine: " + hasEngine);
        System.out.println("hasManualTransmission: " + hasManualTransmission);
    }
}
