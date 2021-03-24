package exemplu5factoryMethod;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by sea.");
    }
}
