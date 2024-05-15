<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    // In a real-world scenario, you'd query a database to check the username/password
    // Here, we'll just check if the username is "admin" and password is "password"
    if(username.equals("admin") && password.equals("password")) {
        session.setAttribute("username", username);
        response.sendRedirect("orderPizza.jsp");
    } else {
    	response.sendRedirect("loginFailed.jsp");
    }
%>