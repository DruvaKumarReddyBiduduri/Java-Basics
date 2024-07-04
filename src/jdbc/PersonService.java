package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonService implements PersonDAO {

    @Override
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        try {
            Connection conn = Connector.conn;
            PreparedStatement select = conn.prepareStatement("select * from  persons");
            ResultSet results = select.executeQuery();

            while (results.next()) {
                persons.add(new Person(results.getInt(1), results.getString(2), results.getString(3), results.getString(4), results.getDate(5)));
            }

        } catch (SQLException e) {
            return List.of();
        }
        return persons;
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public Person getPerson(long id) {
        return null;
    }
}
