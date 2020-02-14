<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Total Result</title>
</head>
<body>
<p>You have below numbers entered.<br>
1st Number: ${userNumPouch.getNum1()}<br>
2nd Number: ${userNumPouch.getNum2()}<br>
3rd Number: ${userNumPouch.getNum3()}<br>
4th Number: ${userNumPouch.getNum4()}</p>
<p>Total is <strong>${userNumPouch.getTotal()}</strong><br>
Total average is <strong>${userNumPouch.displayAverage()}</strong><br>
</p>

<p><a href="index.jsp">Enter another numbers</a></p> 
<p><a href="temperatureConverter.jsp">Change to enter temperatures to convert</a></p> 
</body>
</html>