package authentication;

public class Employee {
    static int idIncrementer=1;
    private  int id;
    private String name,password;
    private double salary;
    private boolean authenticated;

    public Employee(String name, String password, double salary) {
        this.id = idIncrementer++;
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.authenticated = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalaray() {
        return salary;
    }

    public void setSalaray(double salary) {
        this.salary = salary;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", authenticated=" + authenticated +
                '}';
    }
}
