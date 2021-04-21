package terminal;

import java.util.*;
import java.util.stream.IntStream;

public class Ex4_OtherTerminalOps {
    public static void main(String[] args) {
        countExample();
        minMaxExample();
        averageExample();
    }

    private static void averageExample() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
        OptionalDouble optionalDouble = intStream.average();
        System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElseGet(() -> Double.NaN));
    }

    private static void minMaxExample() {
        List<String> names = Arrays.asList("Robert", "Jan", "Jane", "Jackson");
        Optional<String> minName = names.stream().min((n1, n2) -> n1.length() - n2.length());
        minName.ifPresent(System.out::println);

        names = Arrays.asList("Robert", "Jan", "Jane", "Jackson");
        minName = names.stream().min(Comparator.comparingInt(String::length));
        minName.ifPresent(System.out::println);


        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }

    private static void countExample() {
        List<String> names = Arrays.asList("Robert", "Jan", "Jane", "Jackson");
        long number = names.stream().count();
        System.out.println("No of names = " + number);

        names = Arrays.asList("Robert", "Jan", "Jan", "Jackson");
        number = names.stream()
                        .distinct()
                        .count();
        System.out.println("No of distinct names = " + number);
    }
}
