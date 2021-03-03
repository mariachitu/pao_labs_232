package classes;

public class Cat3 {

    public Cat3(){
        System.out.println("default constructor");
    }

    public Cat3(String name)    {
        System.out.println("constructor " + name);
    }

    static {
        System.out.println("My first static block");
    }

    static {
        System.out.println("My second static block");
    }

    {
        System.out.println("My first instance init");
    }
}

class MainCat3{
    public static void main(String[] args) {
        new Cat3();
        new Cat3("PAO");
    }
}