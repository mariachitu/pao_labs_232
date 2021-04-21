package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex7_FlatMap {
    public static void main(String[] args) {
        List<String> studentsInGroup1 = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        List<String> studentsInGroup2 = Arrays.asList("Andrei", "Jack", "Mary", "Dan");
        List<List<String>> studentsInGroups = Arrays.asList(studentsInGroup1, studentsInGroup2);

        System.out.println(studentsInGroups);
        Stream<String> allStudents = studentsInGroups.stream().flatMap(s -> s.stream());
        allStudents.forEach(System.out::println);

        List<List<Integer>> lists = List.of(
                List.of(1,2,3),
                List.of(21,2,3),
                List.of(1,42,3)
        );

        int sum = lists.stream()
                .flatMap(list -> list.stream())
                .reduce(0, (a,b) -> a+b);
        System.out.println(sum);

        List<String > strings = List.of("anana32", "3dh", "ds4f0");
        String digits = "0123456789";

        long nr = strings.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .filter(c -> digits.contains(c))
                .count();
        System.out.println(nr);

        List<Integer> integers = new ArrayList<>();
        IntStream intStream = integers.stream().flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubleStream = integers.stream().flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longStream = integers.stream().flatMapToLong(x -> LongStream.of(x));
    }
}
