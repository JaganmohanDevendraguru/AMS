<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/bootstrap.min.css"/>
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>University Profile Page</title>
</head>
<body>
<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from earning your own money!</p>
                        <input type="submit" name="" value="Login"/><br/>
                    </div>
                    <div class="col-md-9 register-right">
                                <h3 class="register-heading">University Profile</h3>
                                <div class="row register-form">
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
                                </div>
                        </div>
                </div>
            </div>
</body>
</html>




