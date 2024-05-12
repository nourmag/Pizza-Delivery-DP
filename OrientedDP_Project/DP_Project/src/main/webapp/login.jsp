<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login | Pizza Frenzy</title>
<style>
        body {
            background-color: #f8f9fa; /* Light gray background */
            margin: 0; /* Remove default margin */
            padding: 0; /* Remove default padding */
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
            font-size: 28px;
        }

        h3 {
            color: white;
            margin-bottom: 20px;
            font-weight: bold;
        }

        label {
            font-weight: bold;
            color: black; /* Dark green text */
            margin-right: 10px; /* Add space between label and input */
            font-size: 20px; /* Increase font size */
        }

        .form-control {
            border-radius: 5px;
            font-size: 20px; /* Increase font size */
            margin-bottom: 10px; /* Add space between inputs */
        }

        .button-container {
            text-align: center;
        }

        .button-container button {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #059142; /* Dark green */
            border: none;
            border-radius: 5px;
            color: white;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .button-container button:hover {
            background-color: #285c29; /* Darker green on hover */
        }

        footer {
            background-color: #059142; /* Dark green */
            color: white;
            text-align: center;
            padding: 20px 0;
            width: 100%;
            bottom: 0;
            position: fixed;
        }
    </style>
</head>
<body>
<header>
 <img src="logo.png" alt="Pizza Frenzy" style="width: 150px;">
</header>
    <div class="container">
        <h2>Login</h2>
        <div class="section-container">
            <form action="LoginProcess.jsp" method="post">
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