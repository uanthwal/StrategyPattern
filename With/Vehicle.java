package StrategyPatterns.With;

import StrategyPatterns.With.Strategy.IDriveStrategy;

public class Vehicle {
    /**
     * We do not do PassengerVehicle = new Vehicle();
     * NOW Vehicle has a drive strategy i.e. IDriveStrategy
     * and it will support all types of strategies with the help of constructor injection.
     */
    IDriveStrategy iDriveStrategy; 

    Vehicle(IDriveStrategy iDriveStrategy) {
        this.iDriveStrategy = iDriveStrategy;
    }

    void drive() {
        this.iDriveStrategy.drive();
    }
}
