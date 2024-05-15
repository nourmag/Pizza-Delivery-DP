package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class orderRetrivel {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "SELECT * FROM mydb.bill WHERE bill_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "5"); // Example bill_id for retrieval

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String size = rs.getString("size");
                String crust = rs.getString("crust");
                String toppings = rs.getString("toppings");
                int billId = rs.getInt("bill_id");
                int orderId = rs.getInt("order_id");
                float totalPrice = rs.getFloat("total_price");
                String paymentWay = rs.getString("paymentway");
                String customerName = rs.getString("cname");
                String employeeName = rs.getString("ename");

                // Use retrieved data as needed
                System.out.println("Size: " + size);
                System.out.println("Crust: " + crust);
                System.out.println("Toppings: " + toppings);
                System.out.println("Bill ID: " + billId);
                System.out.println("Order ID: " + orderId);
                System.out.println("Total Price: " + totalPrice);
                System.out.println("Payment Way: " + paymentWay);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Employee Name: " + employeeName);
            } else {
                System.out.println("No data found for the specified bill_id.");
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Retrieval failed. Error: " + e.getMessage());
        }
    }
//
	public Map<String, Object> retrieveOrderData(String billId) {
		// TODO Auto-generated method stub
		return null;
	}
}
