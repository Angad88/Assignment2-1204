package Cycle;

import Vehicle.Vehicle;

public class Cycle extends Vehicle {

    public Cycle(String model, String make, int numberOfWheels, int topSpeed) {
        super(model, make, numberOfWheels, topSpeed);
        topSpeed = 0;
    }
    
    public void getVehicleInformation() {
        System.out.println(" \n");
        System.out.println(" Model of Cycle : " + this.getModel() );
        System.out.println(" Make of Cycle : " + this.getMake() );
        System.out.println(" Number of wheels on Cycle : " + this.getNumberOfWheels() );
    }
    
}