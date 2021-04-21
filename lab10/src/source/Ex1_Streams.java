package source;

import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex1_Streams {

    public static void main(String[] args) {
        // finite streams
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElem = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);
        List<String> stringList = List.of("a", "b", "c");
        Stream<String> fromList = stringList.stream();

        fromList.forEach(System.out::println);

        // infinite streams
        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.limit(10)
                .forEach(System.out::println);

        randoms = Stream.generate(Math::random);
        randoms.skip(5)
                .limit(10)
                .forEach(System.out::println);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.skip(3)
                .limit(10)
                .forEach(System.out::println);

        Stream<Integer> oddNumbersUnder100 = Stream.iterate(1,
                                                            n -> n < 100,
                                                            n -> n + 2);
        oddNumbersUnder100.forEach(System.out::println);

        //Primitives
        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(i -> System.out.print(i + " "));

        System.out.println();
        LongStream longStream = LongStream.rangeClosed(1, 5);
        longStream.forEach(l -> System.out.print(l + " "));

        System.out.println();
        DoubleStream doubleStream = new Random().doubles(5);
        doubleStream.forEach(d -> System.out.println(d + " "));
    }
}
