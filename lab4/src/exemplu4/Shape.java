package exemplu4;

public abstract class Shape {

    public abstract double area();
    public abstract double perim();

    public final void sayHello()  {
        System.out.println("start :)");
    }

    public String toString()    {
        return this.getClass().getSimpleName();
    }

}
