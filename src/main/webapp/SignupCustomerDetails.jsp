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
	<% String signUpcustomerName = (String)session.getAttribute("signUpcustomerName"); %>
	<% Integer signUpcustomerId = (Integer)session.getAttribute("signUpcustomerId"); %>
	<% String signUppasswordC = (String)session.getAttribute("signUppasswordC"); %>
	<h2>Congratulations <%=signUpcustomerName %> , you have successfully open bank account</h2>
	<h2>This is your Customer ID , Save for future Logins : <%=signUpcustomerId %></h2>
	<h2>This is your Customer password , Save for future Logins : <%=signUppasswordC %></h2>
	<input type="button" value="Go Back" id="submit" 
					onclick="window.location.href='Welcome.html'"><br><br>
</body>
</html>