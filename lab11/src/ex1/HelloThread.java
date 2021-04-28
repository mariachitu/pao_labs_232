package ex1;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from my first thread! " + Thread.currentThread().getName());
    }
}
