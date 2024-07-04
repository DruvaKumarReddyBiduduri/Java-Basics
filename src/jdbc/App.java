package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void run(){
        Connector connector = new Connector("jdbc:mysql://localhost:3306/tasks", "root", "");
        Connection connection = connector.getConn();

        if(connection!=null){
            PersonService personService=new PersonService();
//            personService.addPerson(new Person(1,"Gojo","tokyo","japan",Date.valueOf("2024-7-4")));

            List<Person> persons=personService.getPersons();
//            System.out.println(persons);
        }else{
            System.out.println("Error connecting to database");
        }


    }
}
