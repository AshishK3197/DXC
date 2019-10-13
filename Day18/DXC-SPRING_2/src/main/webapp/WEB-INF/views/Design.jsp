<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1 align="center">Welcome to the Showroom of dream cars</h1>
<form>
<div align="center">
ShowroomName:<input type ="text"  name ="ShowName"><br><br>
CarName: <input type="text" name="CarName"><br><br>
BrandName: <input type="text" name="BrandName"><br><br>

<input type = "submit" value = "Add"  formaction="add">
<input type = "submit" value= "submit" formaction="getdata">
</div>
 

</form>
</body>
</html>
