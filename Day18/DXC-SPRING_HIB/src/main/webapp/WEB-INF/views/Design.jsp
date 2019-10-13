<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1 align="center">
	Welcome to your Favorite Restaurant 
</h1>
<form action="saveRestaurant" style="text-align: center;">
Enter Restaurant Id:<input type ="number" name ="Restaurant_id"><br><br>
Enter Restaurant Name:<input type = "text"  name = "Restaurant_name"><br><br>
Enter Food Name:<input type = "text"  name = "FoodName"><br><br>
Enter Item Price<input type = "number" name = "Price"><br><br>
<input type= "submit"  value = "SAVE">
 </form>

<form style="text-align: center;">
<input type = "submit" value = "DELETE" formaction="deleteDesign">
<input type = "submit" value = "UPDATE" formaction="UpdateDesign">
<input type = "submit" value = "RETRIEVEALL" formaction="DisplayAll"> 
</form>
</body>
</html>
