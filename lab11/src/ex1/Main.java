package ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin " + Thread.currentThread().getName());
        HelloThread thread = new HelloThread();
        thread.start();
        System.out.println("End " + Thread.currentThread().getName());
    }
}
