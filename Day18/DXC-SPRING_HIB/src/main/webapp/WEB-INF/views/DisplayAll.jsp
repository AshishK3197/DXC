<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p>
<h1 align="center">Looks like you are trying to access the database....</h1> 
</p>
<form action="displaylist" style="text-align: center;">
<input type = "submit" value = "DISPLAYALL"><br><br>
The Restaurants and Pricelist are as follows:--
<c:forEach  items= "${displayList.Restaurant_id}" var="Lists">
${Lists.Restaurant_name };
${Lists.FoodName};
${Lists.Price};
</c:forEach> 
</form>
</body>
</html>
