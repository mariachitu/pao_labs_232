package ex6;

public class MainDemo {
    public static void main(String[] args) {
        CommonResource resource = new CommonResource();

        Producer producer = new Producer("Producer1", resource);
        Consumer consumer = new Consumer("Consumer1", resource);

        producer.start();
        consumer.start();
    }
}
