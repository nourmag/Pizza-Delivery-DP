<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.Pizza" %>
<!DOCTYPE html>
<html>
<head>
<title>Pizza Status | Pizza Frenzy</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<style>
	body {
	background-color: #f8f9fa; /* Light gray background */
}

.container {
	margin-top: 50px;
}

h2 {
	color: #059142; /* Dark green */
	text-align: center;
	margin-bottom: 30px;
	font-weight: bold;
}

p {
	color: #059142; /* Dark green */
	margin-bottom: 20px;
	font-size: 18px;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
}

ul li {
	color: #000; /* Black text */
	margin-bottom: 5px;
}

.btn-primary {
	background-color: #059142; /* Dark green */
	border-color: #059142; /* Dark green */
	color: #fff; /* White text */
	font-weight: bold;
	margin-top: 20px; /* Add space between sections */
}

.btn-primary:hover {
	background-color: #045529; /* Darker green on hover */
	border-color: #045529; /* Darker green on hover */
}
span {
    color: #000; /* Black text */
    font-weight: bold;
    margin-bottom: 20px;
	font-size: 18px;
}

 .status-container {
        display: flex;
        justify-content: center;
        margin-top: 20px;
    }

    .status-step {
        width: 100px;
        height: 100px;
        border-radius: 50%;
        background-color: #ccc;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 18px;
        color: #fff;
        margin: 0 10px;
    }

    .status-preparing {
        background-color: #007bff; /* Blue */
    }

    .status-delivering {
        background-color: #28a745; /* Green */
    }

    .status-received {
        background-color: #ffc107; /* Yellow */
    }

    @media (max-width: 768px) {
        .status-step {
            width: 70px;
            height: 70px;
            font-size: 14px;
        }
    }
    
	</style>
</head>
<body>
	<div class="container mt-5">
		<h2>Pizza Order Summary</h2>
		<p>
			<strong>Size:  </strong><span><%= request.getParameter("size") %></span>
		</p>
		<p>
			<strong>Crust:  </strong><span><%= request.getParameter("crust") %></span>
		</p>
		
		<p><strong>Toppings:  </strong><span><%= getToppings(request.getParameterValues("toppings")) %></span></p>
		<a href="orderPizza.jsp" class="btn btn-primary">Order Another Pizza</a>
    </div>

    <%!
        // Method to format toppings
        public String getToppings(String[] toppings) {
            if (toppings == null || toppings.length == 0) {
                return "None";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < toppings.length; i++) {
                sb.append(toppings[i]);
                if (i < toppings.length - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }
    %>
    
    <div class="status-container">
        <div id="preparing" class="status-step">Preparing</div>
        <div id="delivering" class="status-step">Delivering</div>
        <div id="received" class="status-step">Received</div>
    </div>
    
    <script>
        function updateStatus() {
            setTimeout(function() {
                document.getElementById('preparing').classList.add('status-preparing');
                setTimeout(function() {
                    document.getElementById('preparing').classList.remove('status-preparing');
                    document.getElementById('delivering').classList.add('status-delivering');
                    setTimeout(function() {
                        document.getElementById('delivering').classList.remove('status-delivering');
                        document.getElementById('received').classList.add('status-received');
                    }, 1000);
                }, 1000);
            }, 1000);
        }

        updateStatus();
    </script>
    
    
</body>
</html>