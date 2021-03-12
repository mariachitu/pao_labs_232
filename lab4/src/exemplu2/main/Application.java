package exemplu2.main;

import exemplu2.model.Bus;
import exemplu2.model.Car;
import exemplu2.model.Vehicle;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(1, "A6", "Audi");
        car.printDetails();

        Bus bus = new Bus(2, "B2", "Bus");
        bus.printDetails();

        Vehicle vehicle = new Vehicle(3, "34", "dfd");

        Car car2 = new Bus(4,"435", "234");
    }
}
