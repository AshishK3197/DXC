<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href=<c:url value ="/resources/myCssFile.css" /> rel="stylesheet">
	<link href=<c:url value ="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" /> rel="stylesheet">
	
</head>
<body>
<p>
<h1 align="center" style="color:white;" class="htags">Looks like you are trying to access the database....</h1> 
</p>
<br><br>
<form action="displaylist"  class= "container" style="text-align: center;">
<div class="form-group">
</div><br>
<input type = "submit" value = "DISPLAYALL" class="btn btn-primary"><br><br>
</form>
</body>
</html>
