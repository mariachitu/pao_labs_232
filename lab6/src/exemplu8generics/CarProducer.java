package exemplu8generics;

public class CarProducer implements Producer<Car>{
    @Override
    public Car produce() {
        return new Car();
    }
}
