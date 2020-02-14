<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Converted Temperature Result</title>
</head>
<body>
<p>You have enter temperature in Fahrenheit: ${userTPouch.getUserF()}<br>
${userTPouch.getUserF()} degree Fahrenheit is equal to ${userTPouch.displayFahrenheitResult()} Celsius
</p>
<p>You have enter temperature in Celsius: ${userTPouch.getUserC()}<br>
${userTPouch.getUserC()} degree Celsius is equal to ${userTPouch.displayCelsiusResult()} Fahrenheit</p>
<p><a href="temperatureConverter.jsp">Enter another temperature</a></p> 
<p><a href="index.jsp">Change to enter numbers</a></p> 
</body>
</html>