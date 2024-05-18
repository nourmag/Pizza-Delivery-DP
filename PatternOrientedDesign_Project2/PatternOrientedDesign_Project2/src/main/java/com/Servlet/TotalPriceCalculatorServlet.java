package com.Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pizzaStatus")
public class TotalPriceCalculatorServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters from the request
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
        String[] toppings = request.getParameterValues("toppings");

        // Fetch data from the database and calculate total price
        float totalPrice = calculateTotalPriceFromDatabase(size, crust, toppings);

        // Set total price as a request attribute
        request.setAttribute("totalPrice", totalPrice);

        // Forward to the JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/pizzaStatus.jsp");
        dispatcher.forward(request, response);
    }

    // Method to calculate total price from the database
    private float calculateTotalPriceFromDatabase(String size, String crust, String[] toppings) {
        // Implement your logic here to fetch data from the database
        // and calculate the total price based on the size, crust, and toppings
        float totalPrice = 0.0f;

        // Sample calculation
        // totalPrice = calculateBasePrice(size, crust) + calculateToppingsPrice(toppings);
        // You need to implement these methods according to your database structure and business logic

        return totalPrice;
    }

    // You can implement other methods here to calculate base price, toppings price, etc.
}