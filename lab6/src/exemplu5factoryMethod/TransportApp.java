package exemplu5factoryMethod;

import static exemplu5factoryMethod.TransportationType.SHIP;
import static exemplu5factoryMethod.TransportationType.TRUCK;

public class TransportApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Ship ship = new Ship();

        Transport truck2 = new Truck();
        truck2.deliver();

        Transport ship2 = new Ship();
        ship2.deliver();

        Transport truck3 = TransportFactory.getTransportation(TRUCK);
        Transport ship3 = TransportFactory.getTransportation(SHIP);

        truck3.deliver();
        ship3.deliver();


    }
}
