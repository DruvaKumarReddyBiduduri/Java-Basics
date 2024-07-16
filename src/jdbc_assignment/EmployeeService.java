package jdbc_assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeService {

    Connection conn;

    public EmployeeService(Connection conn) {
        this.conn = conn;
    }

    public void addEmployee(Employee emp){
        try {
            String insertQuery = "insert into employee(name,doj,salary) values(?,?,?)";
            PreparedStatement insertStatement=this.conn.prepareStatement(insertQuery);
            insertStatement.setString(1,emp.name);
            insertStatement.setDate(2,emp.dateOfJoining);
            insertStatement.setFloat(3,emp.salary);
            insertStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding employee ");
            System.out.println("cause : "+e.getMessage());
        }
    }

    public Employee getEmployee(int id){
        Employee employee=null;
        String selectQuery="select * from employee where id=?";
        try {
            PreparedStatement selectStatement=this.conn.prepareStatement(selectQuery);
            selectStatement.setInt(1,id);
            ResultSet results=selectStatement.executeQuery();
            if(results.next()){
                employee=new Employee(results.getInt(1),results.getString(2),results.getDate(3),results.getFloat(4));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching employee details");
            System.out.println("cause : "+e.getMessage());
        }

        return employee;
    }


}
