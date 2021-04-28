package ex2;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from my second thread! " + Thread.currentThread().getName());
    }
}
