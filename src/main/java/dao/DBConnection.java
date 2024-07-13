package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnerction() {

        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/arong";
        String user = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return conn;
    }
}
