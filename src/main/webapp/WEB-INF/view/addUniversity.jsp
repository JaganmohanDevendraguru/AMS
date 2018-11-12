<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Create University Profile</title>
</head>
<body>
	<div class="container register">
		<div class="row">
			<div class="col-md-3 register-left">
				<img src="https://image.ibb.co/n7oTvU/logo_white.png" alt="" />
				<h3>Welcome</h3>
				<p>You are 30 seconds away from earning your own money!</p>
				<input type="submit" name="" value="Login" /><br />
			</div>
			<div class="col-md-9 register-right">
				<h3 class="register-heading">Create a New University Profile</h3>
				<div class="row register-form">
					<form:form action="university/create" method="post"
						modelAttribute="uniForm">
						<div class="col-md-6">
							<div class="form-group">
								<form:input path="uni_code" class="form-control"
									placeholder="University Code *" />
							</div>
							<div class="form-group">
								<form:input path="uni_name" class="form-control"
									placeholder="University Name *" />
							</div>
							<div class="form-group">
								<form:input path="president" class="form-control"
									placeholder="President Name *" />
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<form:input path="email" class="form-control"
									placeholder="Contact Email *" />
							</div>
							<div class="form-group">
								<form:input path="phone" minlength="10" maxlength="10"
									name="txtEmpPhone" class="form-control"
									placeholder="Contact Phone *" />
							</div>
							<div class="form-group">
								<form:input path="street" class="form-control"
									placeholder="Street *" />
							</div>
							<div class="form-group">
								<form:input path="address" class="form-control"
									placeholder="Address " />
							</div>
							<div class="form-group">
								<form:input path="city" class="form-control"
									placeholder="City *" />
							</div>
							<div class="form-group">
								<form:input path="state" class="form-control"
									placeholder="State *" />
							</div>
							<div class="form-group">
								<form:input path="country" class="form-control"
									placeholder="Country *" />
							</div>
							<div class="form-group">
								<form:input path="zip" class="form-control"
									placeholder="Zip Code *" />
							</div>
							<input type="submit" class="btnRegister" value="Create" />
						</div>
					</form:form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>