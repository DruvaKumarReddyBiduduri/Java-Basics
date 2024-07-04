package jdbc;

import java.util.List;

public interface PersonDAO {
    List<Person> getPersons();
    void addPerson(Person person);
    Person getPerson(long id);
}
