package exemplu5factoryMethod;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by land.");
    }
}
