package exemplu1sintaxa;

public abstract interface MyInterface {
    public final static double PI = 3.14;

    public abstract void doSomething();

    public default void sayHello() {
        System.out.println("hello :)");
    }

    public static void ciao(){
        System.out.println("ciao");
    }

    private void test(){
        System.out.println("private test");
    }

    private static void test2(){
        System.out.println("private static test");
    }

}
