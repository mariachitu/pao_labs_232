package exemplu2.model;

public class Bus extends Car {
    int seats;
    private int doors;

    public Bus(int registrationNr, String name, String model) {
        super(registrationNr, name, model);
        this.seats = 30;
        this.doors = 2;
    }

    @Override
    public void printDetails()  {
        System.out.println("Car : " +
                "registrationNr = " + registrationNr +
                " name = " + name +
                " model = " + model +
                " seats = " + seats +
                " doors = " + doors);
    }

}
