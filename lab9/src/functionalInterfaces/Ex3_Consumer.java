package functionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class Ex3_Consumer {

    public static void main(String[] args) {
        Consumer<String> printer = x -> System.out.println(x);
        printer.accept("Hello");

        List<String> names = Arrays.asList("Anna", "Jane", "Mary");
        names.forEach(printer);
        names.forEach(System.out::println);
        System.out.println("Hello team");
        sayHelloToTeam(names);

        IntConsumer c1 = System.out::println;
        c1.accept(12);

        LongConsumer c2 = System.out::println;
        c2.accept(12L);

        DoubleConsumer c3 = System.out::println;
        c3.accept(12.3);

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> bc1 = (k, v) -> map.put(k, v);
        BiConsumer<String, Integer> bc2 = map::put;
        bc1.accept("bread", 5);
        bc2.accept("butter", 10);

        System.out.println(map);

        convertText("My demo text", 1);
        convertText("My demo text", 2);
    }

    private static void sayHelloToTeam(List<String> names)  {
        Consumer<String> sayHello = name -> System.out.println("Hello " + name);
        Consumer<String> sayWelcome = name -> System.out.println("Welcome");

        Consumer<String> andThenConsumer = sayHello.andThen(sayWelcome);
        names.forEach(andThenConsumer);
    }

    private static void convertText(String text, Integer operationCode) {
        BiConsumer<String, Integer> convertConsumer = (String t, Integer op) ->  {
            switch (op) {
                case 1:
                    System.out.println(t.toLowerCase());
                    break;
                case 2:
                    System.out.println(t.toUpperCase());
                    break;
                default:
                    System.out.println("operation not found");
            }
        };
        convertConsumer.accept(text, operationCode);
    }
}
