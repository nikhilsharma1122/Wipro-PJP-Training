<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of movies</title>
</head>
<body>
	<h1>Movies or Series List</h1><br>
	<ol>
		<li>${mov.get(0)}</li>
		<li>${mov.get(1)}</li>
		<li>${mov.get(2)}</li>
		<li>${mov.get(3)}</li>
		<li>${mov.get(4)}</li>
		<li>${mov.get(5)}</li>
		<li>${mov.get(6)}</li>
		<li>${mov.get(7)}</li>
		<li>${mov.get(8)}</li>
		<li>${mov.get(9)}</li>
	</ol>
</body>
</html>
