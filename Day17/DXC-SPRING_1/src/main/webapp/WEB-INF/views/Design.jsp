<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href=<c:url value ="/resources/myFile.css" /> rel="stylesheet">
	<link href=<c:url value ="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" /> rel="stylesheet">
</head>
<body>
<h1 align="center" style="color:blue;" class="htags">
	---------Please enter your Data--------- 
</h1>
<!-- <form action="getdata">
<div align="center">
Name:<input type ="text"  name ="name" placeholder= "UserName"><br><br>
Email : <input type="text" name="email"><br><br>
Phone : <input type="text" name="phone"><br><br>
Password : <input type="text" name="password"><br><br>

City : <input type="text" name="address.city"><br><br>
State : <input type="text" name="address.state"><br><br>
<input type = "submit" class="butn" value= "submit"><br><br>
</div>
 

</form> -->


<form action="getdata" class="container">
  <div class="form-group">
    <label for="name">Name:</label>
    <input type="text" name = "name" class="form-control" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" name = "password" class="form-control" id="pwd">
  </div>
   <div class="form-group">
    <label for="email">Email:</label>
    <input type="Email" name = "email" class="form-control" id="pwd">
  </div>
   <div class="form-group">
    <label for="phone">Number:</label>
    <input type="number" name = "phone" class="form-control" id="pwd">
  </div>
   <div class="form-group">
    <label for="city">City:</label>
    <input type = "text" name = "address.city" class="form-control" id="pwd">
  </div>
   <div class="form-group">
    <label for="state">State:</label>
    <input type = "text" name = "address.state" class="form-control" id="pwd">
  </div>
  

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
