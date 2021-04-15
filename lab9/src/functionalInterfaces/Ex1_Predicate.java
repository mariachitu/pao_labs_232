package functionalInterfaces;

import java.util.List;
import java.util.function.*;

public class Ex1_Predicate {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(17, 13, 15, 23, 26, 235, 14);
        Predicate<Integer> checker = n -> n % 2 == 0;
        System.out.println(checker.test(20));

        System.out.println("n % 2");
        printFilteredNumbers(numbers, checker);

        System.out.println("n < 50");
        printFilteredNumbers(numbers, n -> n < 50);

        Predicate<String> stringPredicate = c-> c.equals("red");
        IntPredicate isNegative = n -> n < 0;
        LongPredicate isDivisibleBy3 = n -> n % 3 == 0;
        DoublePredicate isPositive = n -> n > 0;

        BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
        System.out.println(isBigger.test(11, 10));

        Predicate<String> p1 = a -> a.isEmpty();
        Predicate<String> p2 = String::isEmpty;

        Predicate<String> startsWith = a -> a.startsWith("S");
        Predicate<String> endsWith = a -> a.endsWith("t");
        Predicate<String> negatePredicate = startsWith.negate();

        Predicate<String> andPredicate = startsWith.and(endsWith);
        Predicate<String> orPredicate = startsWith.or(endsWith);


        System.out.println(andPredicate.test("Student"));
        System.out.println(orPredicate.test("Student"));

        System.out.println(andPredicate.test("Students"));
        System.out.println(orPredicate.test("Students"));
    }

    private static void printFilteredNumbers(List<Integer> numbers, Predicate<Integer> checker) {
        for(Integer number : numbers)   {
            if(checker.test(number))    {
                System.out.println(number);
            }
        }
    }
}
