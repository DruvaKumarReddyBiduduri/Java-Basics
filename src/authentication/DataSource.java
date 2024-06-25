package authentication;

public interface DataSource {
    Employee getEmployee(int id) ;
    Employee getEmployee(String name);
    String getPassword(String name);

    String getPassword(int id);

    Employee removeEmployee(int id);

    Employee removeEmployee(String name);

    boolean addEmployee(Employee employee);
    void print();
}
