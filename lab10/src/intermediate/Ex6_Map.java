package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex6_Map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        List<String> namesUpperCase = names.stream()
                .map(elemnet -> elemnet.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(namesUpperCase);

        names = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        List<Integer> namesLen = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(namesLen);

        names = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        int namesLenSum = names.stream()
                .mapToInt(String::length)
                .reduce(0, (a, b) -> a+b);
        System.out.println(namesLenSum);

        names = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        int namesLenSum2 = names.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(namesLenSum2);

        names = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        OptionalInt max = names.stream()
                .mapToInt(String::length)
                .max();
        max.ifPresent(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum());
    }
}
