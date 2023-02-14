package Truck;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
    private boolean AC, handBreak, sound, engine, container;

    public Truck(String model, String make, int numberOfWheels, int topSpeed , boolean AC, boolean handBreak, boolean sound, boolean engine, boolean container) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.handBreak = handBreak;
        this.sound = sound;
        this.engine = engine;
        this.container = container;
    }

    public boolean getAC() {
        return this.AC;
    }

    public boolean getHandBreak() {
        return this.handBreak;
    }

    public boolean getSound() {
        return this.sound;
    }

    public boolean getEngine() {
        return this.engine;
    }

    public boolean getContainer() {
        return this.container;
    }

    public void accelerate() {
        this.engine = true;
    }

    public void breakV() {
        this.engine = false;
    }

    public void handBreak() {
        this.handBreak = true;
    }
    
    public void getVehicleInformation() {
        System.out.println(" \n");
        System.out.println(" Model of Truck : " + this.getModel() );
        System.out.println(" Make of Truck : " + this.getMake() );
        System.out.println(" Number of wheels on Truck : " + this.getNumberOfWheels() );
        System.out.println(" Top Speed of Truck : " + this.getTopSpeed() +"km/h" );
        System.out.println(" AC of Truck : " + ((this.getAC()) ? "On" : "Off"));
        System.out.println(" Hand Break of Truck : " + ((this.getHandBreak()) ? "On" : "Off"));
        System.out.println(" Sound of Truck : " + ((this.getSound()) ? "On" : "Off"));
        System.out.println(" Engine of Truck : " + ((this.getEngine()) ? "On" : "Off"));
        System.out.println(" Container of Truck : " + ((this.getContainer()) ? "Open" : "Closed"));
    }
    
}