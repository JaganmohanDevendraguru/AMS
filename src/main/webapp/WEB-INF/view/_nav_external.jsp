<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Home</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-info-sign"></span> About</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-tasks"></span> Projects</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-envelope"></span> Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      	<li><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-user"></span> Sign up</a></li>
        <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>