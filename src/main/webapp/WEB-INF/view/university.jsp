<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The University Page</title>
</head>
<body>
<table>
<tr>
<th>University Code</th><th>University Name</th><th>Country</th>
</tr>
 <c:forEach items="${listUnis}" var="uni">
 <tr>
 <td>${uni.uni_code}</td><td>${uni.uni_name}</td><td>${uni.country}</td>
 </tr>
 </c:forEach>
</table>
</body>
</html>