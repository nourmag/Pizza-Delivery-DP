package com.Servlet;

import java.io.IOException;
import java.util.Arrays;

import com.Pizza;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PreparePizzaServlet {
  protected void dopost(HttpServletRequest request , HttpServletResponse response)
  throws ServletException , IOException{
    String size = request.getParameter("Size");
    String crust = request.getParameter("crust");
    String[] toppings = request.getParameterValues("toppings");
    String bill_id = request.getParameter("bill_id");
    String order_id = request.getParameter("order_id");
        float total_price = request.getContentLength();
        String paymentway = request.getParameter("paymentway");
        String cname = request.getParameter("cname");
        String ename = request.getParameter("ename");
         
    Pizza pizza = new Pizza (size, crust, Arrays.asList(toppings),bill_id,order_id,total_price,paymentway,cname,ename);
    pizza.prepare();
    pizza.deliver();
    pizza.received();
    
    request.setAttribute("pizza", pizza);
    //page.jsp
    RequestDispatcher dispatcher = request.getRequestDispatcher("");
    dispatcher.forward(request, response);
  }
}