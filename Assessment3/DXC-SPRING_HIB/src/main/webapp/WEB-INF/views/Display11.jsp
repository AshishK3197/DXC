<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href=<c:url value ="/resources/myCssFile.css" /> rel="stylesheet">
	<link href=<c:url value ="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" /> rel="stylesheet">
	<style>
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  padding: 10px; 
  color: white;
}
</style>
</head>
<body>
<p>
<h1 align="center" style="color:white;" class="htags">Your Requested Details are as follows: --</h1>
<p>
<div style="color:white;"  align="center">
<p style="text-align: center; color: white;">
	${List1.restaurant_id} </br>
	${List1.restaurant_name}<br>
	${List1.foodName}<br>
	${List1.foodName}<br>
</p>
</div>
<%-- Restaurant Name: ${rest.restaurant_name}<br>
FoodItem Name: ${rest.foodName}<br>
Price: ${rest.price}<br> --%>
</p>
</body>
</html>
