package com.Servlet;

import java.io.IOException;
import java.util.Map;
import com.db.orderRetrivel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/orderRetrivel")
public class pizza_retrivel_servlet extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String billId = request.getParameter("billId"); // Get the bill_id from the request
        orderRetrivel retriever = new orderRetrivel();
        Map<String, Object> orderData = retriever.retrieveOrderData(billId); // Call the method to retrieve data

        request.setAttribute("orderData", orderData); // Set the retrieved data as a request attribute
        RequestDispatcher dispatcher = request.getRequestDispatcher("/displayOrder.jsp"); // Forward to JSP
        dispatcher.forward(request, response);
    }
}