<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Converter Temperature</h1>
	<form action="getTemperatureConvertServlet" method="post">
	<p>Enter temperature in Fahrenheit : 
	<input type="text" name="userF" size="5" height="30"></p>
	<p>Enter temperature in Celsius: 
	<input type="text" name="userC" size="5" height="30"></p>
	<br>
	<input type="submit" value="Convert Temperature">
	</form>
</body>
</html>