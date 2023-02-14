package Car;

import Vehicle.Vehicle;

public class Car extends Vehicle {
    private boolean AC, handBreak, sound, engine;

    public Car(String model, String make, int numberOfWheels, int topSpeed , boolean AC, boolean handBreak, boolean sound, boolean engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.handBreak = handBreak;
        this.sound = sound;
        this.engine = engine;
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
        System.out.println(" Model of Car : " + this.getModel() );
        System.out.println(" Make of Car : " + this.getMake() );
        System.out.println(" Number of wheels on Car : " + this.getNumberOfWheels() );
        System.out.println(" Top Speed of Car : " + this.getTopSpeed() + "km/h" );
        System.out.println(" AC of Car : " + ((this.getAC()) ? "On" : "Off"));
        System.out.println(" Handbreak of Car : " + ((this.getHandBreak()) ? "On" : "Off"));
        System.out.println(" Sound of Car : " + ((this.getSound()) ? "On" : "Off"));
        System.out.println(" Engine of Car : " + ((this.getEngine()) ? "On" : "Off"));
    }
    
}