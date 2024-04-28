package StrategyPatterns.Without;

/**
 * POINT 1: The SportsVehicle and OffroadVehicle class contains duplicate code as they have 
 * similar drive implementations. This leads to code duplications. 
 * If you were to add more type of Vehicle subclasses with similar implementations you 
 * need to duplicate the code further.
 */
public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        System.out.println();System.out.println();
        /**
         * POINT 2: Vehicle class contains the implementation and kind of hard codes it to
         * normal drive capability.
         */
        Vehicle vehicle2 = new Vehicle();
        vehicle2.drive(); // Will output: Base class drive implementation
    }
}
