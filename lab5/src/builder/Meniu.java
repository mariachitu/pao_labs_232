package builder;

import static builder.Dough.CHEESE;
import static builder.Size.*;

public class Meniu {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.Builder("Marguerita")
                .withBlat(CHEESE)
                .withSize(MEDIUM)
                .withPepperoniTopping(true)
                .withMozzarellaTopping(true)
                .withOliveTopping(true)
                .build();

        myPizza.eat();
    }
}
