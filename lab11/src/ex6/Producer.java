package ex6;

public class Producer extends Thread {
    private final String name;
    private CommonResource resource;

    public Producer(String name, CommonResource resource)   {
        this.name = name;
        this.resource = resource;
    }

    @Override
    public void run()   {
        //produce
        try {
            resource.produce();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
