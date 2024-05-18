package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class orderRetriever {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";

    public Map<String, Object> retrieveOrderData(String billId) {
        Map<String, Object> orderData = new HashMap<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT * FROM mydb.bill WHERE bill_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, billId);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        orderData.put("size", rs.getString("size"));
                        orderData.put("crust", rs.getString("crust"));
                        orderData.put("toppings", rs.getString("toppings"));
                        orderData.put("billId", rs.getInt("bill_id"));
                        orderData.put("orderId", rs.getInt("order_id"));
                        orderData.put("totalPrice", rs.getFloat("total_price"));
                        orderData.put("paymentWay", rs.getString("paymentway"));
                        orderData.put("customerName", rs.getString("cname"));
                        orderData.put("employeeName", rs.getString("ename"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orderData;
    }
}