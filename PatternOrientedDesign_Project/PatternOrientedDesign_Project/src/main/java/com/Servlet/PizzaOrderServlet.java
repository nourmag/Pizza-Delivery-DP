package com.Servlet;
import com.Pizza;
import com.Builder.*;
import com.Proxy.PizzaProxy;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/orderPizza")

public class PizzaOrderServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username != null) {
            String size = request.getParameter("size");
            String crust = request.getParameter("crust");
            String[] toppings = request.getParameterValues("toppings");

            PizzaBuilder builder = new PizzaBuilder().setSize(size).setCrust(crust);
            for (String topping : toppings) {
                builder.addTopping(topping);
            }

            Pizza pizza = builder.build();
            PizzaProxy pizzaProxy = new PizzaProxy(pizza.getSize(), pizza.getCrust(), pizza.getToppings());
            request.setAttribute("pizza", pizzaProxy);
            RequestDispatcher dispatcher = request.getRequestDispatcher("pizzaStatus.jsp");//page.jsp
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("login.jsp");//page.jsp
        }
        
    }
}
