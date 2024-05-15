package com.Proxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Pizza;
import com.db.DataAccessException;
import com.db.DatabaseConnection;

public class PizzaProxyDaoImpl implements PizzaProxyDao {
    private DatabaseConnection dbConnection;

    public PizzaProxyDaoImpl(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public List<PizzaProxy> getAllPizzas() {
        List<PizzaProxy> pizzas = new ArrayList<>();
        String sql = "SELECT * FROM bill";

        try (Connection connection = dbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                Pizza pizza = new Pizza();
                pizza.setSize(rs.getString("size"));
                pizza.setCrust(rs.getString("crust"));
                String toppingsStr = rs.getString("toppings");
                if (toppingsStr != null) {
                    String[] toppingsArr = toppingsStr.split(",");
                    for (String topping : toppingsArr) {
                        pizza.addTopping(topping.trim());
                    }
                }
                pizza.setBillId(rs.getString("bill_id"));
                pizza.setOrderId(rs.getString("order_id"));
                pizza.setTotalPrice(rs.getFloat("total_price"));
                pizza.setPaymentWay(rs.getString("paymentway"));
                pizza.setCname(rs.getString("cname"));
                pizza.setEname(rs.getString("ename"));
                pizzas.add(new PizzaProxy()); // Create a new PizzaProxy object and add it to the list
            }
        } catch (SQLException e) {
            // Wrap the SQLException in a custom unchecked exception
            throw new DataAccessException("Error accessing the database", e);
        }

        return pizzas;
    }
}