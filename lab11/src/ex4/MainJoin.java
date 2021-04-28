package ex4;

public class MainJoin {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();

        //we want to start thread2 after thread1 dies
        try {
            System.out.println("Current thread: " + Thread.currentThread().getName());
            thread1.join();
        } catch (InterruptedException exception)    {
            System.out.println("Exception caught");
        }

        thread2.start();

        //we want to start thread3 after thread2 dies
        try {
            System.out.println("Current thread: " + Thread.currentThread().getName());
            thread2.join();
        } catch (InterruptedException exception)    {
            System.out.println("Exception caught");
        }

        thread3.start();
    }
}
