package Bike;

import Vehicle.Vehicle;

public class Bike extends Vehicle {
    private boolean engine;

    public Bike(String model, String make, int numberOfWheels, int topSpeed,boolean engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public boolean getEngine() {
        return this.engine;
    }

    public void accelerate() {
        this.engine = true;
    }

    public void breakV() {
        this.engine = false;
    }
    
    public void getVehicleInformation() {
        System.out.println(" \n");
        System.out.println(" Model of Bike : " + this.getModel() );
        System.out.println(" Make of Bike : " + this.getMake() );
        System.out.println(" Number of wheels on Bike : " + this.getNumberOfWheels() );
        System.out.println(" Top Speed of Bike : " + this.getTopSpeed() + "km/h");
        System.out.println(" Engine of Bike : " + ((this.getEngine()) ? "On" : "Off"));
        }
    
}