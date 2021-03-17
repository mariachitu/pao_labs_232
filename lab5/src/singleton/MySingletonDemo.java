package singleton;

public class MySingletonDemo {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        MySingleton singleton1 = MySingleton.getInstance();

        if(singleton == singleton1) {
            System.out.println("MySingleton is singleton.");
        }
    }
}
