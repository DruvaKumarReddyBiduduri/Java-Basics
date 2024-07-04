package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connection conn=null;
    private String url,name,password;


    Connector(String url,String name,String password){
        this.name=name;
        this.password=password;
        this.url=url;
    }

    public Connection getConn(){
        if(conn!=null){
            return conn;
        }
        try {
            conn= DriverManager.getConnection(url,name,password);
        } catch (SQLException e) {
            return null;
        }
        return conn;
    }
}