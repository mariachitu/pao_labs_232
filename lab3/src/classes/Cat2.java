package classes;

/*
 -public
 -protected
 -default
 -private
 */
public class Cat2 {
    private String name;
    private int age;

    public Cat2()    {
    }

    public Cat2(String name, int age)    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age)  {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name)    {
        this.name = name;
    }

    public String displayDetails()  {
        return "Cat: name = " + this.name + " , age = " + this.age;
    }

    @Override
    public String toString()    {
        return "Cat: name = " + this.name + " , age = " + this.age;
    }
}

class MainCat2{
    public static void main(String[] args) {
        Cat2 cat = new Cat2("tom", 5);
       // cat.age = 6;
        System.out.println(cat.getAge());
        cat.setAge(11);
        System.out.println(cat.getAge());
        cat.setName("Fluffy");
        System.out.println(cat.getName());

    }
}
