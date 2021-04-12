package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String url = "jdbc:mysql://localhost:3306";
    static String user = "root";
    static String password = "123";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
