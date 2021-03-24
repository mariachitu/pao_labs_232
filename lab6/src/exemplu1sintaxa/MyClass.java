package exemplu1sintaxa;

public class MyClass implements MySecondInterface {
    @Override
    public void doSomething() {
        System.out.println("something");
    }

    public void sayHello() {
        System.out.println("bye :)");
    }

    @Override
    public void doSomethingElse() {

    }
}

class Main  {
    public static void main(String[] args) {
        MyClass object = new MyClass();
        object.doSomething();
        object.sayHello();
        MyInterface.ciao();
    }
}
