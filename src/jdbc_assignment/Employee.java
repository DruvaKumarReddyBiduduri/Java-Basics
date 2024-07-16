package jdbc_assignment;

import java.sql.Date;

public class Employee {
    String name;
    int id;
    float salary;
    Date dateOfJoining;

    public Employee( int id, String name,Date dateOfJoining,float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }
}
