<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Failed | Pizza Frenzy</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa; /* Light gray background */
            margin: 0; /* Remove default margin */
            padding: 0; /* Remove default padding */
        }
         img {
            max-width: 100%; /* Ensure the image doesn't exceed its container */
            height: auto; /* Maintain aspect ratio */
            width: 100px; /* Set a fixed width for the image */
            display: block; /* Ensure proper display */
            margin-left: auto; /* Center the image */
            margin-right: auto; /* Center the image */
            margin-bottom: 10px;
            padding-bottom: 10px;
        }

        .container {
            margin-top: 50px;
            margin-bottom: 50px;
            text-align: center;
            max-width: 400px; /* Set maximum width for the container */
            margin-left: auto; /* Center the container */
            margin-right: auto; /* Center the container */
        }

        .section-container {
            background-color: #d1ac57; /* Gold */
            color: #059142; /* Dark green */
            padding: 20px;
            border-radius: 10px; /* Rounded corners */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Soft shadow effect */
            margin-bottom: 20px;
        }

        h2 {
            color: black;
            margin-bottom: 30px;
            font-weight: bold;
        }

        p {
            color: black;
            margin-bottom: 20px;
            font-size: 16px;
            font-weight: bold;
        }

        .button-container {
            text-align: center;
        }

        .button-container a {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #059142; /* Dark green */
            border: none;
            border-radius: 5px;
            color: white;
            text-decoration: none; /* Remove underline */
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .button-container a:hover {
            background-color: #285c29; /* Darker green on hover */
        }

        footer {
            background-color: #059142; /* Dark green */
            color: white;
            text-align: center;
            padding-top: 30px;
            padding-bottom: 50px;
            width: 100%;
            position: fixed;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login Failed</h2>
        <div class="section-container">
            <p>Sorry, your login attempt failed. Please check your username and password and try again.</p>
            <img src="loginFailed.png" alt="Failed Image">
            <div class="button-container">
                <a href="login.jsp">Back to Login</a>
            </div>
        </div>
    </div>
    <footer>
        &copy; 2024 Pizza Frenzy
    </footer>
</body>
</html>
