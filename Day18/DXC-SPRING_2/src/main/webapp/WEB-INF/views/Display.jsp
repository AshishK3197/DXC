<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Welcome to ${showroom.ShowName}</h1>
<p>Here are all your car details--</p><br><br>
<p>CarDetails and BrandDetails
<c:forEach items = "${showroom.car}" var="cars">
${cars.name}
${cars.brand}
</c:forEach>
</p>
</body>
</html>
