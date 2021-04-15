package functionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class Ex6_BinaryOperation {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(10,11));

        IntBinaryOperator add2 = (a, b) -> a + b;
        System.out.println(add2.applyAsInt(10,11));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> Math.pow(a,b);
        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;

        BinaryOperator<String> binaryOperator = String::concat;
    }
}
