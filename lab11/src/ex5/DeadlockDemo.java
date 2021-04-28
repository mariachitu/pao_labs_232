package ex5;

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();

        //Th1 -> R1, R2
        Runnable runnable1 = () -> {
            synchronized (resource1)    {
                try {
                    System.out.println("Thread 1 has locked resource 1");
                    Thread.sleep(1000);
                } catch (InterruptedException exception)    {
                    exception.printStackTrace();
                }
                synchronized (resource2)    {
                    System.out.println("Thread 1 has locked resource 2");
                }
            }
        };

        //Th2 -> R2, R1
        Runnable runnable2 = () -> {
            synchronized (resource2)    {
                System.out.println("Thread 2 has locked resource 2");
                synchronized (resource1)    {
                    System.out.println("Thread 2 has locked resource 1");
                }
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
