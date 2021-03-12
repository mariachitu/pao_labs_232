package exemplu2.model;

public class Car extends Vehicle { // Car is-A Vehicle
   // Engine engine; // has-A
    int seats;
    private int doors;

    public Car(int registrationNr, String name, String model)    {
        super(registrationNr, name, model);
        this.seats = 5;
        this.doors = 4;
    }

    public void printDetails()  {
        System.out.println("Car : " +
                "registrationNr = " + registrationNr +
                " name = " + name +
                " model = " + model +
                " seats = " + seats +
                " doors = " + doors);
    }
}
