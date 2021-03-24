package exemplu2comparable;

public class Cat implements Comparable <Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                 name + '\'' +
                ", " + age +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.age - cat.age;
    }
}
