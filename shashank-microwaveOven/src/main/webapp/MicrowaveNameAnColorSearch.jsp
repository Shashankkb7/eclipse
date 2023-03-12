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
				alt="" height="48" width="80"> </a><ul>
				<li style="display: inline-block;padding: 20px;">
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a>
					<li style="display: inline-block;">
					<a href="microwave" class="col-lg-2 col-sm-2">Microwave Register</a>
				</ul>
			</div>
	</nav>
	<h1>Welcome to Microwave Name and Color Search page</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message3}</span>
	</c:forEach>
	<span style="color: red">${message1}</span>
	<span style="color: red;">${message2}</span>
	<span style="color: red;">${message3}</span>
	<form action="searchByNameAndColor" method="get">
	Search By Name<input type="text" name="name" value=""/>
	Search By Color<input type="text"name="color" value=""/>
	<input type="submit" value="search"/>
	</form>
	
	
	
	<div>
	<table class="table table-bordered">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Price</th>
	<th>Capacity</th>
	<th>Color</th>
	<th>Since</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
	
	<c:forEach items="${dto}" var="n">
	<tr>
	<td>${n.id}</td>
	<td>${n.name}</td>
	<td>${n.price}</td>
	<td>${n.capacity}</td>
	<td>${n.color}</td>
	<td>${n.since}</td>
	<td><a href="update?id=${n.id}">Edit</a></td>
	<td><a href="delete?id=${n.id}">Delete</a></td>
	</tr>
	</c:forEach>
	
	<c:forEach items="${dtoName}" var="n">
	<tr>
	<td>${n.id}</td>
	<td>${n.name}</td>
	<td>${n.price}</td>
	<td>${n.capacity}</td>
	<td>${n.color}</td>
	<td>${n.since}</td>
	<td><a href="update?id=${n.id}">Edit</a></td>
	<td><a href="delete?id=${n.id}">Delete</a></td>
	</tr>
	</c:forEach>
	
	<c:forEach items="${dtoColor}" var="n">
	<tr>
	<td>${n.id}</td>
	<td>${n.name}</td>
	<td>${n.price}</td>
	<td>${n.capacity}</td>
	<td>${n.color}</td>
	<td>${n.since}</td>
	<td><a href="update?id=${n.id}">Edit</a></td>
	<td><a href="delete?id=${n.id}">Delete</a></td>
	</tr>
	</c:forEach>
	
		</table>	
	</div>
</body>
</html>