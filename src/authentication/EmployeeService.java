package authentication;

import java.util.Scanner;

public class EmployeeService {

    private static void initializeEmployees(DataSource dataSource) {
        dataSource.addEmployee(new Employee("Gojo", "Password", 13000.0));
        dataSource.addEmployee(new Employee("Sukuna", "sukuna", 3000.0));
        dataSource.addEmployee(new Employee("Naruto", "sasuke", 9000.0));
        dataSource.addEmployee(new Employee("Jiraya", "106", 10000.0));
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        DataSource dataSource = new EmployeeMap();
//        DataSource dataSource = new EmployeeList();
        AuthenticationService authenticationService = new AuthenticationService(dataSource);
        initializeEmployees(dataSource);

        String name = "", password = "";
        Employee authenticatedEmployee = null;
        boolean flag = true;

        while (flag) {
            if (authenticatedEmployee == null) {
                System.out.print("Please Enter Your Name : ");
                name = scanner.next();
                Employee employee = dataSource.getEmployee(name);
                if (employee == null) {
                    System.out.println("Cannot Find User with Name : " + name);
                    System.out.println("Please Enter Valid Credentials");
                    continue;
                }
                if (!employee.isAuthenticated()) {
                    System.out.println("You are Not Authorized to access sources");
                    System.out.print("Please Enter your password For authentication : ");
                    password = scanner.next();
                    boolean authenticated = authenticationService.authenticate(name, password);
                    if (authenticated) {
                        employee.setAuthenticated(true);
                        authenticatedEmployee = employee;
                    }
                }
            } else {
                System.out.println("Select one of the operations");
                System.out.println("1 to view employees data");
                System.out.println("2 to search employee by name");
                System.out.println("3 to remove employee by name");
                System.out.println("5 to exit");
                System.out.println();

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        dataSource.print();
                        break;
                    }
                    case 2: {
                        System.out.print("Enter a name to search : ");
                        String search = scanner.next();
                        Employee employee = dataSource.getEmployee(search);
                        if (employee != null) {
                            System.out.println("Employee found : " + employee);
                            break;
                        }
                        System.out.println("No Employee was found with name " + search);
                        break;
                    }
                    case 3: {
                        System.out.print("Enter a name to remove : ");
                        String search = scanner.next();
                        Employee employee = dataSource.removeEmployee(search);
                        if (employee != null) {
                            System.out.println("Successfull removed Employee " + employee);
                            break;
                        }
                        System.out.println("No Employee was found with name " + search);

                        break;
                    }
                    case 5: {
                        flag = false;
                        System.out.println("Exiting");
                        System.out.println(":(");
                        break;
                    }
                    default: {
                        System.out.println("Invalid Choice");
                        System.out.println("Please Select From Above Choices");
                    }
                }
            }
        }

    }
}
