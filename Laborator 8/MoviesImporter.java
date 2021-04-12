package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MoviesImporter {
    static String url = "jdbc:mysql://localhost:3306";
    static String user = "root";
    static String password = "";
    public static void main(String[] args) {
	// write your code here
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Done");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
