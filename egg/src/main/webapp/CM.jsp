<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<h1>Welcome to CM page</h1>
	<form action="cm" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter CM name" />
		</div>
		 Party <select class="form-select"
			aria-label="Default select example" name="party">
			<option value="">Select party</option>
			<option>BJP</option>
			<option>KJP</option>
			<option>AAP</option>
			<option>Prajakeeya</option>
			<option>Congerss</option>
			<option>JDS</option>
		</select>
		State <select class="form-select"
			aria-label="Default select example" name="state">
			<option value="">Select party</option>
			<option>Karnataka</option>
			<option>Kerala</option>
			<option>Andhra pradesh</option>
			<option>Maharashtra</option>
			<option>Tamil nadu</option>
			<option>Madhya pradesh</option>
		</select>
		Tenure<select class="form-select"
			aria-label="Default select example" name="tenure">
			<option value="">Select Tenure</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
			</select>
		<div class="mb-3">
			<label for="formFile" class="form-label">PortFolio</label>
			 <textarea rows="4" cols="20" name="portfolio"></textarea>
		</div>
		<input type="submit" value="Save" />
</form>
</body>
</html>