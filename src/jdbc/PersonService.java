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
            PreparedStatement select = conn.prepareStatement("select * from  person");
            ResultSet results = select.executeQuery();

            while (results.next()) {
                persons.add(new Person(results.getInt(1), results.getString(2), results.getString(3), results.getString(4), results.getDate(5)));
            }
            System.out.println(persons);
            return persons;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return List.of();
        }
    }

    @Override
    public void addPerson(Person person) {
        try {
            Connection conn = Connector.conn;
            PreparedStatement insert = conn.prepareStatement("insert into person values(?,?,?,?,?)");

            insert.setLong(1, person.getId());
            insert.setString(2,person.getName());
            insert.setString(3,person.getCity());
            insert.setString(4,person.getCountry());
            insert.setDate(5,person.getDate());

            insert.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Person getPerson(long id) {
        return null;
    }
}
