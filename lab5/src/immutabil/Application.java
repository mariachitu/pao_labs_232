package immutabil;

public class Application {
    public static void main(String[] args) {
        MutableDateOfBirth dateOfBirth = new MutableDateOfBirth(17, 3, 1999);
        ImmutablePerson person = new ImmutablePerson(1, "Gigel", dateOfBirth);
        System.out.println(person);
        dateOfBirth.setDay(20);
        System.out.println(person);
    }
}
