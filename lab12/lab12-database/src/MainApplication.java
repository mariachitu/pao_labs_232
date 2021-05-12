import config.SetUpDataUsingStatemnt;
import model.Person;
import repository.PersonRepository;

import java.util.Optional;

public class MainApplication {

/*
 *   Statement
 *   PreparedStatement
 *   CallableStatement
 */

    public static void main(String[] args) {

        SetUpDataUsingStatemnt setUpData = new SetUpDataUsingStatemnt();
        setUpData.createTable();
        setUpData.addPerson();
        setUpData.getAllPersons();

        PersonRepository personRepository = new PersonRepository();
        personRepository.insert("Ioana", 35);
        personRepository.insert(new Person("Denis", 25));

        Optional<Person> person = personRepository.getById(3);
        if(person.isPresent())  {
            System.out.println(person.get());
        }

        personRepository.updateName("Cristina", 3);

        person = personRepository.getById(3);
        if(person.isPresent())  {
            System.out.println(person.get());
        }

        personRepository.insertPersonProcedure(new Person("Gigel", 40));

    }
}
