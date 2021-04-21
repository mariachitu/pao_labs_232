package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex3_Match {
    public static void main(String[] args) {
        List<String> finite = List.of("student", "10", "pao");
        Stream<String> infiniteStream = Stream.generate(() -> "pao");
        Predicate<String> startsWithLetter = elem -> Character.isLetter(elem.charAt(0));

        //iterating
        boolean result = finite.stream().anyMatch(startsWithLetter);
        System.out.println(result);
        result = finite.stream().allMatch(startsWithLetter);
        System.out.println(result);
        result = finite.stream().noneMatch(startsWithLetter);
        System.out.println(result);

        result = infiniteStream.anyMatch(startsWithLetter);
        System.out.println(result);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> first = list.stream().findFirst();
        if(first.isPresent())   {
            System.out.println(first.get());
        }
        System.out.println(first.isEmpty());

        Optional<Integer> any = list.stream().findAny();
        if(any.isPresent())   {
            System.out.println(any.get());
        }
    }
}
