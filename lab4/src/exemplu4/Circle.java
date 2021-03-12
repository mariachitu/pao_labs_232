package exemplu4;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius)    {
        this.radius = radius;
    }

    public double area()    {
        return PI * Math.pow(radius, 2);
    }

    public double perim()   {
        return 2 * PI * radius;
    }
}
