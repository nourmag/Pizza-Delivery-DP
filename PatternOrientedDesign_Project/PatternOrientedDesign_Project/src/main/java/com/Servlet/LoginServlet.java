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
            response.sendRedirect("jsp/orderPizza.jsp"); // Redirect to the order pizza page
        } else {
            response.sendRedirect("jsp/loginFailed.jsp"); // Redirect to the login failed page
        }
    }

    private boolean isValidCredentials(String username, String password) {
        // Check the credentials against a secure data store (e.g., database)
        // For demonstration purposes, hard coded values are used here
        String predefinedUsername = "admin";
        String predefinedPassword = "password";
        return predefinedUsername.equals(username) && predefinedPassword.equals(password);
    }
}