package exemplu7functionalInterfaces;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(new SumFunction().apply(1, 1));

        Function difFunction = (int a, int b) -> a - b;
        System.out.println(difFunction.apply(10, 1));

        Function multiplyFunction = (int a, int b) -> {
            return a * b;
        };
        System.out.println(multiplyFunction.apply(10, 10));

        calculate(multiplyFunction);
        calculate((a, b) -> a % b);
        calculate((a, b) -> a * b);
    }

    private static void calculate(Function function) {
        System.out.println(function.apply(20, 11));
    }
}
