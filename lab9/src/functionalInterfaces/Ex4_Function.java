package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Ex4_Function {

    public static void main(String[] args) {
        Function<String, Integer> convertStringToInt = str -> str.length();
        Function<String, Integer> convertStringToInt2 = String::length;
        System.out.println(convertStringToInt.apply("PAO LABS"));
        System.out.println(convertStringToInt2.apply("PAO LABS"));

        DoubleFunction<String> doubleToString = num -> Double.toString(num);
        DoubleToIntFunction doubleToIntFunction = num -> (int) num;
        DoubleToLongFunction doubleToLongFunction = num -> (long) num;

        BiFunction<String, String, String> bf1 = (str, toAdd) -> str.concat(toAdd);
        BiFunction<String, String, String> bf2 = String::concat;
        System.out.println(bf1.apply("pao", "labs"));
        System.out.println(bf2.apply("pao", "labs"));

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 10));

        List<String> names = Arrays.asList("Anna", "Jane", "Mary");
        convertStringToInt(names, convertStringToInt);
    }

    private static void convertStringToInt(List<String> names, Function<String, Integer> convertStringToInt)  {
        List<Integer> numbers = names.stream()
                .map(convertStringToInt)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
