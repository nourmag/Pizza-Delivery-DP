<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.Servlet.LoginServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login | Pizza Frenzy</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
<header>
 <img src="images/logo.png" alt="Pizza Frenzy" style="width: 150px;">
</header>
    <div class="container">
        <h2>Login</h2>
        <div class="section-container">
            <form action="login" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control" required>
                </div>
                <div class="button-container">
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>
            </form>
        </div>
    </div>
    <footer>
        &copy; 2024 Pizza Frenzy
    </footer>
</body>
</html>