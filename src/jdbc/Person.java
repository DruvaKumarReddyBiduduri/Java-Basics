package jdbc;

import java.sql.Date;

public class Person {
    long id;
    String name,city,country;
    Date date;

    public Person(long id, String name, String city, String country,Date date) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.date=date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", date=" + date +
                '}';
    }
}
