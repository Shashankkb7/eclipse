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
<link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap"
      rel="stylesheet"/>
    <style>
    body {
  background-color: #344a72;
  font-family: "Roboto", sans-serif;
}
nav {
	background-color: #333;
	color: #fff;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px;
}
nav ul {
	list-style: none;
	margin: 0;
	padding: 0;
	display: flex;
}
nav ul li {
	margin: 0 10px;
}
nav ul li a {
	color: #fff;
	text-decoration: none;
	padding: 5px 10px;
}
nav ul li a:hover {
	background-color: #555;
	border-radius: 5px;
}
nav img {
	height: 50px;
	padding: 5px;
	margin-right: auto;
}

a {
	color: blue;
	text-decoration: none;
	padding: 5px 10px;
</style>
</head>
<body>
	<nav>
		<img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="">
		<ul>
			<li style="float:right"><a href="index.jsp">Home Page</a></li>
  			<li style="float:right"><a href="SignUp.jsp">SignUp</a></li>
 			<li style="float:right"><a href="SignIn.jsp">Logout</a></li>
 			<li style="float:right"><a class="active" href="About.jsp">About</a></li>
		</ul>
		<span style="color: white;">Welcome:${userId}</span>
		  <div align="right">
		  <img src="download?fileName=${dtoPic}" alt="">
		  </div>
	</nav>
	<div align="center" style="color: white;">
	<h1 style="color: white;">Login successfully</h1>
	<!-- <h2 style="color:green">UserId : <span>${userId}</span></h2> -->
	<h3 style="color: red;">${emptyTechnologies}</h3>
	<a style="color: red" href="ProfileUpdate.jsp">Update profile</a> <br> 
	<a style="color: red" href="addTechnology?id=${dto.id}">Add technologies</a><br>
	<a style="color: red" href="viewTechnology?id=${dto.id}">View technologies</a><br>
	</div> 
</body>
</html>