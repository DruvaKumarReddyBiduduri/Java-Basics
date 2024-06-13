package inheritance;

public class Employee {
    int id;
    String name;
    float salary;

    Employee(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void  showDetails(){
        System.out.println("id :" +id);
        System.out.println("name :" +name);
        System.out.println("salary :" +salary);

    }
}
