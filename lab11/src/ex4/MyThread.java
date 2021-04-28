package ex4;

public class MyThread extends Thread {

    @Override
    public void run()   {
        for(int i = 0; i < 2; i++)  {
            try {
                Thread.sleep(500);
                System.out.println("Current thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e)    {
                System.out.println("Exception caught");
            }
            System.out.println(i);
        }
    }
}
