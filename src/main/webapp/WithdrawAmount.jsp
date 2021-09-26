<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/Form.css">
<meta charset="ISO-8859-1">
<title>Succesfully Withdrawal</title>
</head>
<body>
	<div class="main">
	<div class="register">
	
	<% Integer SignIncustomerid = (Integer)session.getAttribute("SignIncustomerid"); %>
    <% Integer Withdrawamount = (Integer)session.getAttribute("Withdrawamount"); %>
    <h2> Amount Successfully Withdraw</h2><br>
    <h2> Amount Withdraw form id : <%=SignIncustomerid %><br>
    Withdrawal Amount : <%=Withdrawamount %><br>
    	<input type="button" value="Go Back" id="submit" 
					onclick="window.location.href='UserHome.html'"><br><br>
</body>
</html>