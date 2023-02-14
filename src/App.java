import Car.Car;
import Truck.Truck;
import Bike.Bike;
import Cycle.Cycle;
public class App {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("TESTMODEL1", "TEST1", 4,190, false, true,false,false);
        Truck truck1 = new Truck("TESTMODEL2", "TEST2", 4,120, true, true,true,false,true);

        Bike bike1 = new Bike("TESTMODEL3", "TEST3", 2,80, true);
        Cycle cycle1 = new Cycle("TESTMODEL3", "TEST3", 2,0);


        car1.getVehicleInformation();
        car1.accelerate();
        car1.getVehicleInformation();
        truck1.getVehicleInformation();
        bike1.getVehicleInformation();
        cycle1.getVehicleInformation();

    }
}