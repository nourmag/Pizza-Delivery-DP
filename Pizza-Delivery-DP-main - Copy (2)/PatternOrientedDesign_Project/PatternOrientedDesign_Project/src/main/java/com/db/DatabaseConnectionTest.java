package com.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database connection URL
            String url = "jdbc:mysql://localhost:3306/mydb";
            
            // Database credentials
            String username = "root";
            String password = "0000";
            
            // Attempt to establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            
            // Connection successful
            System.out.println("Connected to the database successfully.");
            
            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
