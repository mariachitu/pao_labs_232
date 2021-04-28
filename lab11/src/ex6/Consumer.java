package ex6;

public class Consumer extends Thread {
    private final String name;
    private CommonResource resource;

    public Consumer(String name, CommonResource resource)   {
        this.name = name;
        this.resource = resource;
    }

    @Override
    public void run() {
        //consumer
        try {
            resource.consume();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
