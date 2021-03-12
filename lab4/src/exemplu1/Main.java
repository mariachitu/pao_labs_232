package exemplu1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("tom");
        Cat cat2 = new Cat("tom");

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(new Dog()));
    //    System.out.println(cat1 == new Dog());

        System.out.println(new Cat("tom"));

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}
