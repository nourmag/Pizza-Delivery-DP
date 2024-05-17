package com.Servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        

        if (isValidCredentials(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("jsp/orderPizza.jsp");//page.jsp
        } else {
            response.sendRedirect("jsp/loginFailed.jsp");//page.jsp
        }
    }
	 private boolean isValidCredentials(String username, String password) {
	        String predefinedUsername = "admin";
	        String predefinedPassword = "password";

	        return predefinedUsername.equals(username) && predefinedPassword.equals(password);
	    }
}