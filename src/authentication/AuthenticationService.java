package authentication;

public class AuthenticationService {
    DataSource dataSource;

    public AuthenticationService(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public boolean authenticate(String name,String password){
        Employee emp=dataSource.getEmployee(name);
        if(emp==null){
            System.out.println("Employee Not Found");
            return false;
        }

        if(!emp.getPassword().equals(password)){
            System.out.println("Passwords do not match");
            return false;
        }
        System.out.println("Authentication successful");
        return true;
    }
}
