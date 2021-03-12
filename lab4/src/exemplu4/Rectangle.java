package exemplu4;

public class Rectangle extends Shape {
    private double length, height;

    public Rectangle(double length, double height)  {
        this.length = length;
        this.height = height;
    }

    public double area()    {
        return length * height;
    }

    public double perim()  {
        return 2 * length + 2 *height;
    }


}
