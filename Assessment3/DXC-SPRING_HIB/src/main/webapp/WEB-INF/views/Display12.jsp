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

<h1 align="center" style="color:white;" class="htags">Total number of records retreived are: ${List.size()}

</h1><p>
<c:forEach items="${List}" var="rest"><br>
<br>
<table align="center" style="width:50%" style="font-family:Georgia, Garamond, Serif; color:white; font-style:italic;"   >
  <tr>
    <th>Restaurant ID</th>
    <th>Restaurant Name</th>
    <th>Food Item</th>
    <th>Price</th>
  </tr>
  <tr>
    <td>${rest.restaurant_id}</td>
    <td>${rest.restaurant_name}</td>
    <td>${rest.foodName}</td>
    <td>${rest.price}</td>
  </tr>


</table>
<%-- <tr>${rest.restaurant_id}</tr> <tr>${rest.restaurant_name}</tr> <tr>${rest.foodName}</tr> <tr>${rest.price}</tr><br> --%>

</c:forEach>
</p>
</body>
</html>
