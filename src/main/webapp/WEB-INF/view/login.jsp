<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ASM Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
	<jsp:include page="_nav_external.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h2>Admin Login Form</h2>
				<form:form action="login" method="POST" modelAttribute="loginForm">
					<table>
						<tr>
							<td>Email:</td>
							<td><form:input path="email" /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><form:password path="password" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								class="btn btn-default" value="Login" /></td>
						</tr>
					</table>
				</form:form>
			</div>

			<div class="col-md-6">
				<h2>Student Login Form</h2>
				<form action="studentLogin" method="post">
					<table>
						<tr>
							<td>Student ID:</td>
							<td><input type="text" name="studentId" required /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type="password" name="password" required /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								class="btn btn-default" value="Login" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="_footer.jsp"></jsp:include>
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>