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
	<% String signUpemployeeName = (String)session.getAttribute("signUpemployeeName"); %>
	<% Integer signUpemployeeId = (Integer)session.getAttribute("signUpemployeeId"); %>
	<% String signUppassword = (String)session.getAttribute("signUppassword"); %>
	<h2>Congratulations <%=signUpemployeeName %> , you have successfully registered as a Bank employee</h2>
	<h2>This is your Employee ID , Save for future Logins : <%=signUpemployeeId %></h2>
	<h2>This is your Employee password , Save for future Logins : <%=signUppassword %></h2>
	<input type="button" value="Go Back" id="submit" 
					onclick="window.location.href='Welcome.html'"><br><br>
</body>
</html>