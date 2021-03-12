package exemplu3;

public class ZooService {

    Animal[] animals;
    private int lastIndex;
    private int maximNrOfAnimals;

    public ZooService(int maximNrOfAnimals) {
        this.animals = new Animal[maximNrOfAnimals];
        this.lastIndex = 0;
        this.maximNrOfAnimals = maximNrOfAnimals;
    }

    public void addAnimal(Animal animal)    {
        if(lastIndex < animals.length)  {
            animals[lastIndex] = animal;
            System.out.println("Add animal " +
                    animal.getClass().getSimpleName() +
                    " at index " + lastIndex++);
        }
    }
}
