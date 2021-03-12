package exemplu4;

import java.util.Arrays;

public class GeometryApplication {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perim());

        Circle circle = new Circle(12);
        System.out.println(circle.area());
        System.out.println(circle.perim());

        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle;
        shapes[1] = circle;
//        shapes[2] = new Shape() {
//            @Override
//            public double area() {
//                return 0;
//            }
//
//            @Override
//            public double perim() {
//                return 0;
//            }
//        }
        System.out.println(Arrays.toString(shapes));
        circle.sayHello();
        rectangle.sayHello();
    }
}
