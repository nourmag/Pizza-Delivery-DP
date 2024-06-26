package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class orderInserter {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            String sql = "INSERT INTO mydb.bill (size, crust, toppings, bill_id, order_id, total_price, paymentway, cname, ename) VALUES (?, ?,?,?,?,?,?,?,? )";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, "Medium"); // size
            pstmt.setString(2, "Thin"); //crust
            pstmt.setString(3, "Chesse"); // toppings
            pstmt.setString(4, "6"); //bill_id
            pstmt.setString(5, "2"); //order_id
            pstmt.setFloat(6, 2500); // total_price
            pstmt.setString(7, "Visa"); //payment way
            pstmt.setString(8, "Shahd"); //customer
            pstmt.setString(9, "hady"); //employee
            
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Insertion failed. Error: " + e.getMessage());
        }
    }
}