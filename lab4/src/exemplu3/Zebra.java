package exemplu3;

public class Zebra  extends Animal {

    public Zebra( int age)  {
        super(age);
        this.sound = "other";
    }

    public Zebra()  {
        this(10);
    }

    public Zebra(String name)   {
        super(7, name);
    }

    @Override
    public void eat(int food)   {
        System.out.println("Zebra is eating " + food + " units of food!");
    }

    public double getAverageWeight()    {
        return super.getAverageWeight() - 10;
    }

}
