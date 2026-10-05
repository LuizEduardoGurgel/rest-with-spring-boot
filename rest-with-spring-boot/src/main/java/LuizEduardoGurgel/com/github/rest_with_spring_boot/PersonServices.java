package LuizEduardoGurgel.com.github.rest_with_spring_boot;

import LuizEduardoGurgel.com.github.rest_with_spring_boot.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        logger.info("Finding all People!");
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id){
        logger.info("Finding one Person!");

        //mock, aqui vai se tornar um acesso ao banco de dados
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Luiz");
        person.setLastName("Oliveira");
        person.setAddress("Natal - Rio Grande do Norte - Brasil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){

        logger.info("Creating one Person");

        return person;
    }
    public Person update(Person person){

        logger.info("Updating one Person");

        return person;
    }

    public void delete(String id){

        logger.info("Deleting one Person");
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person" + i);
        person.setLastName("Oliveira");
        person.setAddress("Somewhere in Brasil");
        person.setGender("Male");
        return person;
    }
}
