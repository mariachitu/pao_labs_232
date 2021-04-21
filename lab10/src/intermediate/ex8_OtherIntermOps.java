package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ex8_OtherIntermOps {
    public static void main(String[] args) {
        Stream<String > names = Stream.of("Robert", "Jack", "Jane", "Jackson");
        names.sorted()
                .forEach(System.out::println);

        names = Stream.of("Robert", "Jack", "Jane", "Jackson");
        names.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        names = Stream.of("Robert", "Jack", "Jane", "Jackson");
        names.map(e -> new StringBuilder(e).reverse().toString())
                .sorted()
                .forEach(System.out::println);

        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,6,7,1,8,9,10);
        ints.stream()
                .distinct()
                .peek(i -> System.out.println("distinct value " + i + " "))
                .sorted()
                .peek(s -> System.out.println("sorted value " + s + " "))
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        ints = Arrays.asList(1,2,3,4,50,6,7,6,7,1,8,9,10);
        ints.stream()
                .takeWhile(x -> x < 50)
                .forEach(System.out::println);

        System.out.println("==========");
        ints = Arrays.asList(1,2,3,4,50,6,7,6,7,1,8,9,10);
        ints.stream()
                .dropWhile(x -> x < 50)
                .forEach(System.out::println);
    }
}
