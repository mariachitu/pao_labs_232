package ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin " + Thread.currentThread().getName());
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
        System.out.println("End " + Thread.currentThread().getName());
    }
}
