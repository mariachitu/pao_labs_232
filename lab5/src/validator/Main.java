package validator;

public class Main {
    public static void main(String[] args) {
        PersonValidator validator = new PersonValidator();

        Person p1 = new Person("Maria", "Chitu", "072334232313", 26);
        Person p2 = new Person("maria", "chitu", "072334232313", 26);
        Person p3 = new Person("Maria", "", "072334232313", 26);
        Person p4 = new Person("Maria", "Chitu", "032334232313", 26);
        Person p5 = new Person("Maria", "Chitu", "07233313", 26);
        Person p6 = new Person("Maria", "Chitu", "072334232313", 14);

        Person[] persons = new Person[] {p1, p2, p3, p4, p5, p6};

        for(Person person : persons)    {
            validator.validate(person);
        }

        System.out.println("Error message");
        for(Person person : persons)    {
            String message = validator.validateWithErrorMessages(person);
            System.out.println(message + "for " + person);
        }
    }
}
