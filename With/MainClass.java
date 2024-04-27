package StrategyPatterns.With;

/**
 * Now we have created an interface strategy. If any new driving strategy is required to
 * added we just need to add a new concrete class for it.
 * i.e.
 * Under Strategy/XYZStrategy that will implement IDriveStrategy
 */
public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        System.out.println();
        System.out.println();
    }
}
