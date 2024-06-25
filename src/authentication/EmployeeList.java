package authentication;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements DataSource{
    List<Employee> data;

    public EmployeeList() {
        this.data = new ArrayList<>();
    }

    @Override
    public Employee getEmployee(int id) {
        for (Employee employee:data) {
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    }

    @Override
    public Employee getEmployee(String name) {
        for (Employee employee:data) {
            if(employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }

    @Override
    public String getPassword(String name) {
        Employee employee=getEmployee(name);
        if (employee==null){
            return null;
        }
        return employee.getPassword();
    }

    @Override
    public String getPassword(int id) {
        Employee employee=getEmployee(id);
        if (employee==null){
            return null;
        }
        return employee.getPassword();
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee deletedEmployee=null;
        for (int i = 0; i < data.size(); i++) {
            Employee employee=data.get(i);
            if (employee.getId()==id){
                deletedEmployee=data.remove(i);
                break;
            }
        }
        return deletedEmployee;
    }

    @Override
    public Employee removeEmployee(String name) {
        Employee deletedEmployee=null;
        for (int i = 0; i < data.size(); i++) {
            Employee employee=data.get(i);
            if (employee.getName().equals(name)){
                deletedEmployee=data.remove(i);
                break;
            }
        }
        return deletedEmployee;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        return data.add(employee);
    }

    @Override
    public void print() {
        for (Employee employee:data) {
            System.out.println(employee);
        }
    }
}
