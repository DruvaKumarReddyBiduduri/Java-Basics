package authentication;


import java.util.HashMap;
import java.util.Map;

public class EmployeeMap implements DataSource {
    Map<String, Employee> data;

    public EmployeeMap() {
        this.data = new HashMap<>();
    }

    @Override
    public Employee getEmployee(int id) {
        for (Employee employee:data.values()) {
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    }

    @Override
    public Employee getEmployee(String name) {
        return data.get(name);
    }

    @Override
    public String getPassword(String name) {
        Employee employee=getEmployee(name);
        if(employee!=null){
            return employee.getPassword();
        }
        return null;
    }

    @Override
    public String getPassword(int id) {
        for (Employee employee:data.values()) {
            if(employee.getId()==id){
                return employee.getPassword();
            }
        }
        return null;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee employee=getEmployee(id);
        if(employee==null){
            return null;
        }
        return data.remove(employee.getName());
    }


    @Override
    public Employee removeEmployee(String name) {
        return data.remove(name);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        try {
            data.put(employee.getName(), employee);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void print() {
        for (Employee employee:data.values()) {
            System.out.println(employee);
        }
    }
}
