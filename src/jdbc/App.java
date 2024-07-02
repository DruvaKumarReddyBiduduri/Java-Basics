package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class App {
    public static void run(){
        Connector connector = new Connector("jdbc:mysql://localhost:3306/tasks", "root", ".Adgjmptw5");

        Connection connection = connector.getConn();
        String query = "select * from person";
        String insertQuery = "insert into person values(?,?,?,?)";
        String updateQuery="update person set pname=? where id=?";
        String deleteQuery="delete from person  where id=?";


        try {
            PreparedStatement insert = connection.prepareStatement(updateQuery);
            insert.setString(1,"Naruto");
            insert.setInt(2,4);
            insert.executeUpdate();

            PreparedStatement delete=connection.prepareStatement(deleteQuery);
            delete.setInt(1,6);
            delete.executeUpdate();

            ResultSet set = connection.prepareStatement(query).executeQuery();

            while (set.next()) {
                System.out.println(set.getInt(1) + " " + set.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
