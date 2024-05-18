package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TotalPriceCalculator {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "0000";

    public float calculateTotalToppingPrice(String[] toppings) {
        float totalPrice = 0.0f;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establish database connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare SQL query to fetch the price of a topping
            String query = "SELECT price FROM Toppings WHERE name = ?";
            preparedStatement = connection.prepareStatement(query);

            // Loop through each topping to get its price
            for (String topping : toppings) {
                preparedStatement.setString(1, topping);
                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    totalPrice += resultSet.getFloat("price");
                } else {
                    System.out.println("Topping not found: " + topping);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return totalPrice;
    }

    public float getPizzaBasePrice(String size, String crust) {
        float basePrice = 0.0f;
        switch (size.toLowerCase()) {
            case "small":
                basePrice += 8.0f;
                break;
            case "medium":
                basePrice += 10.0f;
                break;
            case "large":
                basePrice += 12.0f;
                break;
            default:
                System.out.println("Size not recognized: " + size);
        }

        switch (crust.toLowerCase()) {
            case "thin":
                basePrice += 2.0f;
                break;
            case "thick":
                basePrice += 3.0f;
                break;
            default:
                System.out.println("Crust type not recognized: " + crust);
        }

        return basePrice;
    }
    
}