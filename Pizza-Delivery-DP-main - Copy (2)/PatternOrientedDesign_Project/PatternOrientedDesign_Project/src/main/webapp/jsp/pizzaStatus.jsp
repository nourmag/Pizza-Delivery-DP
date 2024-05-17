<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.Pizza"%>
<%@ page import="com.Proxy.PizzaProxy"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>Pizza Status | Pizza Frenzy</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/pizzaStatus.css">

</head>
<body>
	<div class="container mt-5">
		<h2>Pizza Order Summary</h2>
		<p>
			<strong>Size: </strong><span><%= request.getParameter("size") %></span>
		</p>
		<p>
			<strong>Crust: </strong><span><%= request.getParameter("crust") %></span>
		</p>

		<p>
			<strong>Toppings: </strong><span><%= getToppings(request.getParameterValues("toppings")) %></span>
		</p>
		<a href="orderPizza.jsp" class="btn btn-primary">Order Another
			Pizza</a>
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
    <div class="status-wrapper">
        <div id="preparing" class="status-step">Preparing</div>
        <div id="preparing-label" class="status-label"></div>
    </div>
    <div class="status-wrapper">
        <div id="delivering" class="status-step">Delivering</div>
        <div id="delivering-label" class="status-label"></div>
    </div>
    <div class="status-wrapper">
        <div id="received" class="status-step">Received</div>
        <div id="received-label" class="status-label"></div>
    </div>
</div>


	<script>
    function updateStatus() {
        setTimeout(function() {
            document.getElementById('preparing').classList.add('status-preparing');
            document.getElementById('preparing-label').innerText = 'Preparing...';

            // Circle and label disappear together
            setTimeout(function() {
                document.getElementById('preparing').classList.remove('status-preparing');
                document.getElementById('preparing-label').innerText = '';
            }, 1000); // Wait for one second after preparing

            setTimeout(function() {
                document.getElementById('delivering').classList.add('status-delivering');
                document.getElementById('delivering-label').innerText = 'Delivering...';

                // Circle and label disappear together
                setTimeout(function() {
                    document.getElementById('delivering').classList.remove('status-delivering');
                    document.getElementById('delivering-label').innerText = '';
                }, 1000); // Wait for one second after delivering

                setTimeout(function() {
                    document.getElementById('received').classList.add('status-received');
                    document.getElementById('received-label').innerText = 'Received';

                    // Circle and label disappear together
                    setTimeout(function() {
                        document.getElementById('received').classList.remove('status-received');
                        document.getElementById('received-label').innerText = '';
                    }, 1000); // Wait for one second after receiving
                }, 1000); // Wait for one second after delivering
            }, 1000); // Wait for one second after preparing
        }, 1000); // Initial delay
    }

    updateStatus();
</script>

</body>
</html>