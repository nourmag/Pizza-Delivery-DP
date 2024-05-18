<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Pizza Order</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/orderPizza.css">
</head>
<body>
	<nav>
		<div class="logo">
			<img src="../images/logo.png" alt="Pizza Frenzy">
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
