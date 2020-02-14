<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>Calculate Numbers Total</h1>
	<form action="getTotalServlet" method="post">
	<p>Enter four whole numbers in below input: </p>
	<input type="number" name="userNum1" size="5" height="30"> <input type="number" name="userNum2" size="5" height="30"> <input type="number" name="userNum3" size="5" height="30"> <input type="number" name="userNum4" size="5" height="30">
	<br>
	<br>
	<input type="submit" value="Calculate Total">
	</form>
</body>
</html>