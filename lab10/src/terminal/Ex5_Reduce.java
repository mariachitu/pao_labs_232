package terminal;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex5_Reduce {
    public static void main(String[] args) {
        reduceSumExample();
        reduceStrExample();
        collectExample();
        joiningExample();
        groupingByExample();
        mappingExample();
    }

    private static void mappingExample() {
        Stream<String> stream = Stream.of("aa", "b", "cccc", "dddd");
        List<Integer> output = stream.collect(Collectors.mapping(s -> s.length(),
                Collectors.toList()));
        System.out.println(output);
    }

    private static void groupingByExample() {
        Stream<String> stream = Stream.of("aa", "b", "cccc", "dddd");
        Map<Integer, List<String>> map = stream.collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(map);
    }

    private static void joiningExample() {
        Stream<String> stream = Stream.of("aa", "b", "cccc", "ddddd");
        String all = stream.collect(Collectors.joining());
        System.out.println(all);

        stream = Stream.of("aa", "b", "cccc", "ddddd");
        all = stream.collect(Collectors.joining(","));
        System.out.println(all);

        stream = Stream.of("aa", "b", "cccc", "ddddd");
        all = stream.collect(Collectors.joining("_", "prefix_", "_sufix"));
        System.out.println(all);
    }

    private static void collectExample() {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> nr = integers.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(nr);

        Stream<String> stream = Stream.of("m", "b", "q", "d");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);

        stream = Stream.of("m", "b", "q", "d");
        set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);

        stream = Stream.of("mdf", "bewrw", "3q", "dfggh");
        Map<String, Integer> map = stream.collect(Collectors.toMap(
                s -> s,
                s -> s.length()
        ));
        System.out.println(map);

        stream = Stream.of("3q", "bewrw", "3q", "dfggh");
        map = stream.collect(Collectors.toMap(
                s -> s,
                s -> s.length(),
                (a, b) -> a + b
        ));
        System.out.println(map);
    }

    private static void reduceStrExample() {
        Stream<String> stringStream = Stream.of("p", "a", "o");
        String word = stringStream.reduce("", (str, letter) -> str + letter);
        //      String word = stringStream.reduce("", String::concat);
        System.out.println(word);

        stringStream = Stream.of("p", "a", "o");
        StringBuilder wordB = stringStream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );
        System.out.println(wordB);
    }

    private static void reduceSumExample() {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sumReduced = integers.stream().reduce(10, (a, b) -> a + b);
        System.out.println(sumReduced);

        OptionalInt optionalInt = IntStream.range(1, 11).reduce((a, b) -> a + b);
        optionalInt.ifPresent(System.out::println);

        integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer prodReduced = integers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(prodReduced);
    }
}
