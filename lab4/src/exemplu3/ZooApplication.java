package exemplu3;

public class ZooApplication {

    public static void main(String[] args) {

        Animal animal = new Animal(5);
        Animal urs = new Animal(12, "urs");
        Animal bird = new Animal(1, "pasare", "cip-cip");

        System.out.println(animal);
        System.out.println(urs);
        System.out.println(bird);

        Zebra zebra = new Zebra(5);
        System.out.println(zebra);
        System.out.println(new Zebra());
        System.out.println(new Zebra("Zizi"));

        urs.eat(20);
        zebra.eat(12);

        System.out.println(urs.getAverageWeight());
        System.out.println(zebra.getAverageWeight());

        ZooService zooService = new ZooService(10);
//        zooService.addAnimal(urs);
//        zooService.addAnimal(bird);
        zooService.addAnimal(zebra);
        zooService.addAnimal(new Zebra("ziz"));
        zooService.addAnimal(new Lion(10, "lion", "roar"));
    }
}
