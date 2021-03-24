package exemplu2comparable;

import java.util.Arrays;

public class CatHouse {
    public static void main(String[] args) {
        Cat cats[] = {
                new Cat("Luna", 7),
                new Cat("Tom", 5),
                new Cat("Lucy", 2),
                new Cat("Kitty", 9)
        };

        System.out.println("Unorseted: " + Arrays.toString(cats));
        Arrays.sort(cats);
        System.out.println("Sorted: " + Arrays.toString(cats));
    }
}
