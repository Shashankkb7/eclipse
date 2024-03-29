<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to Microwave Update page</h1>

	<c:forEach items="${errors}" var="f">
		<span style="color: red;">${f.message3}</span>
	</c:forEach>
	<div><span style="color: green">${message2}</span></div>
	<form action="update" method="post">
	<div class="mb-3">
			<label for="formFile" class="form-label">Id</label> <input
				type="text" class="form-control" name="id" id="formFile" readonly="readonly"
				placeholder="Enter Id" value="${dto.id}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile" readonly required="required"
				placeholder="Enter name" value="${dto.name}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Price</label> <input
				type="number" class="form-control" name="price" id="formFile" required="required"
				placeholder="Enter price" value="${dto.price}" />
		</div>
		Select Color <select class="form-select"
			aria-label="Default select example" name="color" required="required">
			<option selected value="${dto.color}">${dto.color}</option>
			<c:forEach items="${colors}" var="c">
			<option value="${c}">${c}</option>
			</c:forEach>
			</select>
		<div class="mb-3">
			<label for="formFile" class="form-label">Capacity</label> <input
				type="number" class="form-control" name="capacity" id="formFile" required="required"
				placeholder="Enter capacity" value="${dto.capacity}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Since</label> <input
				type="number" class="form-control" name="since" id="formFile" required="required"
				placeholder="Enter since" value="${dto.since}" />
		</div>
		<input type="submit" value="Update" class="btn btn-primary"/>
		</form>
</body>
</html>