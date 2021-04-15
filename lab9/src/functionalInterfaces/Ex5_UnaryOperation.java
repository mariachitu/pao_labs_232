package functionalInterfaces;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Ex5_UnaryOperation {
    public static void main(String[] args) {
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("This is my demo text"));

        IntUnaryOperator intUnaryOperator = x -> x * 2;
        System.out.println(intUnaryOperator.applyAsInt(20));

        LongUnaryOperator longUnaryOperator = x -> x * 2;
        DoubleUnaryOperator doubleUnaryOperator = x -> x * 2;
    }
}
