package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2_Filter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robert", "Jack", "Jane", "Jackson");
        Stream< String> result = names.stream().filter(name -> name.startsWith("J"));
        //result.forEach(System.out::println);

        result.filter(name -> name.contains("Jack"))
                .forEach(System.out::println);

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n < 8)
                .forEach(System.out::println);

        System.out.println("==========");
        IntStream intStream = IntStream.rangeClosed(1, 20);
        IntPredicate p1 = n -> n % 2 == 0;
        IntPredicate p2 = n -> n < 10;
        intStream.filter(p1.and(p2)).forEach(System.out::println);
    }
}
