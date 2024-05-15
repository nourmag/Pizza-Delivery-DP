<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Order Details</title>
</head>
<body>
    <h1>Order Details</h1>
    <table border="1">
        <tr>
            <th>Size</th>
            <th>Crust</th>
            <th>Toppings</th>
            <th>Bill ID</th>
            <th>Order ID</th>
            <th>Total Price</th>
            <th>Payment Way</th>
            <th>Customer Name</th>
            <th>Employee Name</th>
        </tr>
        <tr>
            <td>${orderData.size}</td>
            <td>${orderData.crust}</td>
            <td>${orderData.toppings}</td>
            <td>${orderData.billId}</td>
            <td>${orderData.orderId}</td>
            <td>${orderData.totalPrice}</td>
            <td>${orderData.paymentWay}</td>
            <td>${orderData.customerName}</td>
            <td>${orderData.employeeName}</td>
        </tr>
    </table>
</body>
</html>