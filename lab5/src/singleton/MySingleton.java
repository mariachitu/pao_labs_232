package singleton;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton()   {
        System.out.println("First time the constructor is being called.");
    }

    public static MySingleton getInstance() {
        if(instance == null)    {
            instance = new MySingleton();
        }
        return instance;
    }
}
