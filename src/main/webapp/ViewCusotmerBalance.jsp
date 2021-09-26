<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Form.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="main">
	<div class="register">
	
	<% Integer CustomerViewbalance = (Integer)session.getAttribute("CustomerViewbalance"); %>
	
	<h2>Your Current Balance is : <%=CustomerViewbalance %><br><br>
	<input type="button" value="Go Back" id="submit" 
					onclick="window.location.href='UserHome.html'"><br><br>
</body>
</html>