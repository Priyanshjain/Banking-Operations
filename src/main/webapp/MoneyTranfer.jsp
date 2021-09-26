<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Form.css">
<meta charset="ISO-8859-1">
<title>Sucessfully Transfer</title>
</head>
<body>
	<div class="main">
	<div class="register">
	
<% Integer SignIncustomerid = (Integer)session.getAttribute("SignIncustomerid"); %>
<% Integer MoneyreceiverId = (Integer)session.getAttribute("MoneyreceiverId"); %>
<% Integer Sendamount = (Integer)session.getAttribute("Sendamount"); %>

<h2>  Money transfer Successfully from sender's id : <%=SignIncustomerid %><br>
       To Receiver's Id : <%=MoneyreceiverId %><br>
       Transferred amount is : <%=Sendamount %><br><br>
       	<input type="button" value="Go Back" id="submit" 
					onclick="window.location.href='UserHome.html'"><br><br>
</body>
</html>