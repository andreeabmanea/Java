package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Connection conn;

    static {
         String url = "jdbc:mysql://localhost:3306";
         String user = "root";
         String password = "123";

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(url, user, password);
             System.out.println("SUCCES");

         } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();
         }
    }

    public static Connection getConnection(){

        return conn;
    }
}
