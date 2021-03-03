package classes;

public class Calculator {

    public int sum(int a, int b)    {
        return a + b;
    }

    public double sum(double a, double b)    {
        return a + b;
    }

    public double sum(double a, double b, double c)    {
        return a + b + c;
    }

    public double sum(int a, double b)    {
        return a + b;
    }
}

class MainCalculator{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 12));
        System.out.println(calculator.sum(10, 12.7));
        System.out.println(calculator.sum(10.0, 12.3));
        System.out.println(calculator.sum(10.0, 12.3, 1.4));
    }
}
