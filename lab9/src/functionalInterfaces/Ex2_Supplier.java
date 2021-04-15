package functionalInterfaces;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Ex2_Supplier {

    public static void main(String[] args) {
        Supplier<Integer> number = () -> 11;
        System.out.println(returnNumber(number));

        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(returnNumber(random));

        IntSupplier maxInt = () -> Integer.MAX_VALUE;
        System.out.println(maxInt.getAsInt());

        LongSupplier maxLong = () -> Long.MAX_VALUE;
        System.out.println(maxLong.getAsLong());

        DoubleSupplier pi = () -> Math.PI;
        System.out.println(pi.getAsDouble());

        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s2 = LocalDate::now; //reference to a static method
        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<StringBuilder> s3 = () -> new StringBuilder();
        Supplier<StringBuilder> s4 = StringBuilder::new;
    }

    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
