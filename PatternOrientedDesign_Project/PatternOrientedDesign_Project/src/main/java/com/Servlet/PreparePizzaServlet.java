package com.Servlet;

import java.io.IOException;
import java.util.Arrays;

import com.Pizza;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/PreparePizzaServlet")
public class PreparePizzaServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void dopost(HttpServletRequest request , HttpServletResponse response)
	throws ServletException , IOException{
		String size = request.getParameter("Size");
		String crust = request.getParameter("Crust");
		String[] toppings = request.getParameterValues("toppings");
		Pizza pizza = new Pizza (size, crust, Arrays.asList(toppings));
		pizza.prepare();
		pizza.deliver();
		pizza.received();
		
		request.setAttribute("pizza", pizza);
		//page.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("pizzaStatus.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String statusMessage = "";

        if ("prepare".equals(action)) {
            statusMessage = new Pizza().prepare();
        } else if ("deliver".equals(action)) {
            statusMessage = new Pizza().deliver();
        } else if ("received".equals(action)) {
            statusMessage = new Pizza().received();
        }

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(statusMessage);
    }
}
