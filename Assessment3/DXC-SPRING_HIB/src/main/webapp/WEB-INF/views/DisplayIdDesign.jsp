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
<h1 align="center" style="color:white;" class="htags">Looks like you are trying to search!!!</h1>


<form action="dispID" class="container" style="text-align: center;">
  <div class="form-group">
    <label for="id" style="color: white">Enter Restaurant Id:</label>
    <input type="number" name = "Restaurant_id" class="form-control" id="pwd">
  </div><br>
  <input type = "submit" value = "SEARCH RESTURANT" class="btn btn-primary">
</form> 
</p>
</body>
</html>
