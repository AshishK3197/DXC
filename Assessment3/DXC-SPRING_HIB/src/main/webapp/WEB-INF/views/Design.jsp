	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href=<c:url value ="/resources/myCssFile.css" /> rel="stylesheet">
	<link href=<c:url value ="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" /> rel="stylesheet">
</head>
<body>
<h1 align="center" style="color:white;" class="htags">
	Welcome to your Favorite Restaurant !!!!
</h1><br>
<br>
<!-- <form action="saveRestaurant" style="text-align: center;">
Enter Restaurant Id:<input type ="number" name ="Restaurant_id"><br><br>
Enter Restaurant Name:<input type = "text"  name = "Restaurant_name"><br><br>
Enter Food Name:<input type = "text"  name = "FoodName"><br><br>
Enter Item Price<input type = "number" name = "Price"><br><br>
<input type= "submit"  value = "SAVE">
 </form> -->
 
 
 
 
 
 <form action="saveRestaurant" class="container">
 <fieldset>
 <legend style="text-align: center; color: white;">PLease Register To Continue!!!</legend>
  <div class="form-group">
    <label for="id" style="color: white">Enter Restaurant Id:</label>
    <input type="number" name = "Restaurant_id" class="form-control" id="pwd">
  </div><br>
  <div class="form-group">
    <label for="name" style="color: white">Enter Restaurant Name:</label>
    <input type="text" name = "Restaurant_name" class="form-control" id="pwd">
  </div><br>
   <div class="form-group">
    <label for="name1" style="color: white">Enter Food Name:</label>
    <input type="text" name = "FoodName" class="form-control" id="pwd">
  </div><br>
   <div class="form-group">
    <label for="price" style="color: white">Enter Item Price:</label>
    <input type="number" name = "Price" class="form-control" id="pwd">
  </div><br>
  

  <button type="submit" class="btn btn-primary" value="SAVE">Submit</button>
  </fieldset>
</form><br><br>

<form style="text-align: center;">
<input type = "submit" value = "DELETE" formaction="deleteDesign" class="btn btn-primary">
<input type = "submit" value = "UPDATE" formaction="UpdateDesign" class="btn btn-primary">
<input type = "submit" value = "SEARCH" formaction="DisplayIdDesign" class="btn btn-primary">
<input type = "submit" value = "RETRIEVEALL" formaction="DisplayAll" class="btn btn-primary"> 

</form>
</body>
</html>
