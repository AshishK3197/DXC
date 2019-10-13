<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p>
Welcome Home ${customer.name} ! <br>
Your Contact Information is displayed below--<br>
Email: ${customer.email} <br>
Phone:${customer.phone}<br>
Password:${customer.password}<br>
Your residence details are-- <br>
City:${customer.address.city}<br>
State:${customer.address.state}<br>
 
</p>
</body>
</html>
