<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p>
<h1 align="center">Looks like you are trying to update...!!!!</h1> 
</p>


<form action="updateRest" style="text-align: center;">
Enter Restaurant Id:<input type ="number" name ="Restaurant_id"><br><br>
Enter Food Name:<input type = "text"  name = "FoodName"><br><br>
<input type = "submit" value = "UPDATE RESTURANT"> 
 


</form>



</body>
</html>
