<%@page import ="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Prime List</h1>
	<%
		ArrayList<Integer> primelist = (ArrayList<Integer>)request.getAttribute("primearrlist");
	for(Integer num:primelist){
		out.print(num+" ");
	}
	%>
</body>
</html>
