<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Pizza Order</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
/* Custom CSS */
body {
	background-color: #f8f9fa; /* Light gray background */
}

nav {
	background-color: #059142;
	color: #fff;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px 20px;
	height: 75px;
}

nav ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	display: flex;
}

nav ul li {
	margin-right: 20px;
	font-weight: bold;
}

nav ul li a {
	text-decoration: none;
	color: #fff;
}

nav ul li a:hover {
	color: #059142;
	background-color: white;
	text-decoration: none;
}

.logo img {
	width: 100px;
	height: auto;
}

.container {
	margin-top: 50px;
	margin-bottom: 50px;
}

.section-container {
	background-color: #d1ac57; /* Gold background */
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Soft shadow effect */
	margin-bottom: 20px;
}

h2 {
	color: black;
	text-align: center;
	margin-bottom: 30px;
	font-weight: bold;
	text-align: center;
}

h3 {
	color: black;
	text-align: center;
	margin-bottom: 16px;
	font-weight: bold;
	text-align: center;
}

label {
	font-weight: bold;
	color: black;
}
/* Customizing form inputs */
.form-control {
	border-radius: 5px;
}
/* Styling checkboxes */
input[type="checkbox"] {
	margin-right: 5px;
}
/* Button style */
.btn-primary {
	background-color: #059142; /* Dark green */
	border-color: #059142; /* Dark green */
}

.btn-primary:hover {
	background-color: #059142; /* Darker green on hover */
	border-color: #059142; /* Darker green on hover */
}

.section-container {
	overflow: auto;
	/* Ensure container expands to contain floated child elements */
}

.toppings-section {
	float: left; /* Float the toppings sections to the left */
	width: 50%; /* Each section takes half of the container's width */
}

.toppings-section input[type="checkbox"] {
	margin-bottom: 10px; /* Add some space between checkboxes */
}

.button-container {
	text-align: center; /* Center align the button */
}

.button-container button {
	padding: 10px 20px; /* Increase padding to make the button bigger */
	font-size: 16px; /* Increase font size */
}

footer {
	background-color: #059142;
	color: #fff;
	text-align: center;
	padding: 20px 0;
	width: 100%;
	bottom: 0;
}
</style>
</head>
<body>
	<nav>
		<div class="logo">
			<img src="logo.png" alt="Pizza Frenzy">
		</div>
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</nav>
	<div class="container">
		<h2>Order Your Pizza</h2>
		<form action="pizzaStatus.jsp" method="post">
			<div class="row">
				<div class="col-md-6">
					<div class="section-container">
						<h3>Size</h3>
						<div class="form-group">
							<select class="form-control" id="size" name="size">
								<option>Small</option>
								<option>Medium</option>
								<option>Large</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="section-container">
						<h3>Crust</h3>
						<div class="form-group">
							<select class="form-control" id="crust" name="crust">
								<option>Thin</option>
								<option>Thick</option>
								<option>Stuffed</option>
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="section-container">
						<h3>Toppings</h3>
						<div class="form-group">
							<div class="toppings-section">
								<input type="checkbox" name="toppings" value="Cheese">
								Cheese<br> <input type="checkbox" name="toppings"
									value="Pepperoni"> Pepperoni<br> <input
									type="checkbox" name="toppings" value="Mushrooms">
								Mushrooms<br>
							</div>
							<div class="toppings-section">
								<input type="checkbox" name="toppings" value="Chicken">
								Chicken<br> <input type="checkbox" name="toppings"
									value="Veggies"> Veggies<br> <input
									type="checkbox" name="toppings" value="Seafood">
								Seafood<br>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 button-container">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</form>
	</div>

	<footer> &copy; 2024 Pizza Frenzy </footer>
</body>
</html>