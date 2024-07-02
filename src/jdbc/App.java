package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class App {
    public static void run(){
        Connector connector = new Connector("jdbc:mysql://localhost:3306/tasks", "root", ".Adgjmptw5");

        Connection connection = connector.getConn();
        String query = "select * from person";
        String insertQuery = "insert into person values(?,?,?,?)";
        String updateQuery="update person set pname=? where id=?";
        String deleteQuery="delete from person  where id=?";
        Scanner scanner=new Scanner(System.in);

        try {

            for (int i = 1; i <11; i++) {
                PreparedStatement insert = connection.prepareStatement(insertQuery);
                insert.setInt(1,i);
                System.out.print("Enter Name : ");
                insert.setString(2,scanner.next());
                System.out.print("Enter City : ");
                insert.setString(3,scanner.next());
                System.out.print("Enter Country : ");
                insert.setString(4,scanner.next());
                insert.executeUpdate();
            }


//            PreparedStatement delete=connection.prepareStatement(deleteQuery);
//            delete.setInt(1,6);
//            delete.executeUpdate();

            ResultSet set = connection.prepareStatement(query).executeQuery();

            while (set.next()) {
                System.out.println(set.getInt(1) + "\t" + set.getString(2) + "\t"+set.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
