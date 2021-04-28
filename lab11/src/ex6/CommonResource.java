package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonResource {
    private List<Integer> buffer;
    private int capacity;

    public CommonResource() {
        this.buffer = new ArrayList<>();
        this.capacity = 5;
    }

    public void produce() throws InterruptedException {
        while (true)    {
            int valueProduced = new Random().nextInt(10);
            synchronized (buffer)   {
                while (buffer.size() == capacity)   {
                    System.out.println("Buffer is full, waiting...");
                    buffer.wait();
                }
                buffer.add(valueProduced);
                System.out.println(valueProduced + " was produced");
                buffer.notify();
            }
            Thread.sleep(1000);
        }
    }

    public void consume() throws InterruptedException {
        while (true)    {
            synchronized (buffer)   {
                while(buffer.isEmpty()) {
                    System.out.println("Buffer is empty, waiting...");
                    buffer.wait();
                }
                int valueConsumed = buffer.remove(0);
                System.out.println(valueConsumed + " was consumed");
                buffer.notify();
            }
            Thread.sleep(1000);
        }
    }
}
