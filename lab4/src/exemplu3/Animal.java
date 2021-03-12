package exemplu3;

public class Animal {

    private int age;
    private String name;
    protected String sound;

    public Animal(int age)  {
        //super();
        this.age = age;
        this.sound = "silent";
    }

    public Animal(int age, String name)   {
        this.age = age;
        this.name = name;
    }

    public Animal(int age, String name, String sound)   {
        this(age, name);
        this.sound = sound;
    }

    public String toString()    {
        return "Animal : " +
                "age = " + age +
                " name = " + name +
                " sound = " + sound;
    }

    public void eat (int food)  {
        System.out.println("Animal is eating " + food + " units of food!");
    }

    public double getAverageWeight()    {
        return 50;
    }
}
