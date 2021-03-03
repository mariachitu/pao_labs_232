package classes;

public class Cat {
    String name;
    int age;
    static int numberOfCats = 0;

    public Cat()    {
        System.out.println("Constructor 1");
        numberOfCats++;
    }

    public Cat(String name, int age)    {
        this.age = age;
        this.name = name;
        System.out.println("Constructor 2");
        numberOfCats++;
    }

    public String displayDetails()  {
        return "Cat: name = " + this.name + " , age = " + this.age;
    }

    @Override
    public String toString()    {
        return "Cat: name = " + this.name + " , age = " + this.age;
    }
}

class MainCat{
    public static void main(String[] args) {
        System.out.println("numberOfCats = " + Cat.numberOfCats);
        Cat cat = new Cat();
        System.out.println("numberOfCats = " + Cat.numberOfCats);
        Cat cat2 = new Cat("Tom", 4);
        System.out.println("numberOfCats = " + Cat.numberOfCats);
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat2.name);
        System.out.println(cat2.age);
        cat.name = "Fluffy";
        cat.age = 10;
        System.out.println(cat.name);
        System.out.println(cat.age);

        System.out.println(cat2.displayDetails());

        System.out.println(cat2);
    }
}
