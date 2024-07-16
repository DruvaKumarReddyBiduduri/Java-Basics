package jdbc_assignment;

import jdbc.Connector;

import java.sql.Connection;

public class App {

    public static void run(){
        Connector connector = new Connector("jdbc:mysql://localhost:3306/demo", "root", ".Adgjmptw5");
        Connection connection = connector.getConn();

        if(connection!=null){
            
        }else{
            System.out.println("Error connecting database");
        }
    }
}
