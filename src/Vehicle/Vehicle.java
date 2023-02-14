package Vehicle;

public class Vehicle {
    
    private String model;
    private String make;
    private int numberOfWheels;
    private int topSpeed;
  
    public Vehicle(String model, String make, int numberOfWheels, int topSpeed) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
    }



    public Vehicle() {
        this.model = "Not Defined / Unknown";
        this.make = "Not Defined / Unknown";
        this.numberOfWheels = 0;
        this.topSpeed = 0;
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }
 
}