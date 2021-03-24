package exemplu5factoryMethod;

public class TransportFactory {
    public static Transport getTransportation(TransportationType type){
        switch (type){
            case TRUCK:
                return new Truck();
            case SHIP:
                return new Ship();
            default:
                return null;
        }
    }
}
