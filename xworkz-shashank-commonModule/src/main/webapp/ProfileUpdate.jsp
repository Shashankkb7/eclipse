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
	<!--<link rel="stylesheet" href="Css/style.css" />-->
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap"
      rel="stylesheet"/>
    <style>
    body {
  background-color: #344a72;
  font-family: "Roboto", sans-serif;
}
.signup-box {
  width: 370px;
  height: auto;
  margin: auto;
  background-color: white;
  border-radius: 3px;
}

.login-box {
  width: 360px;
  height: 280px;
  margin: auto;
  border-radius: 3px;
  background-color: white;
}

h1 {
  text-align: center;
  padding-top: 15px;
}

h4 {
  text-align: center;
}

form {
  width: 300px;
  margin-left: 20px;
}

form label {
  display: flex;
  margin-top: 20px;
  font-size: 18px;
}

form input {
  width: 100%;
  padding: 7px;
  border: none;
  border: 1px solid gray;
  border-radius: 6px;
  outline: none;
}
input[type="button"] {
  width: 320px;
  height: 35px;
  margin-top: 20px;
  border: none;
  background-color: #49c1a2;
  color: white;
  font-size: 18px;
}
p {
  text-align: center;
  padding-top: 20px;
  font-size: 15px;
}
.para-2 {
  text-align: center;
  color: white;
  font-size: 15px;
  margin-top: -10px;
}
.para-2 a {
  color: #49c1a2;
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
		<span style="color: red;">Welcome:${userId}</span>
		<div align="right">
		  <img src="download?fileName=${dtoPic}" alt="">
		  </div>
	</nav>

<div class="signup-box">
    <h1>Welcome to Profile update page</h1>
    <span style="color: red">${error}</span>
    <span style="color: green">${success}</span>
	<form action="upload" method="post" onsubmit="return validateEmail()"
			name="myformNumber" onsubmit="return validateNumber()" enctype="multipart/form-data">
		<div class="mb-3">
			<label for="formFile" class="form-label">Email</label> <input
				type="email" class="form-control" name="email" id="emailId" value="${dto.email}" readonly="readonly"
				placeholder="Enter email" onchange="onEmail()"/>
				 <span id="emailError" style="color: red"></span>
				 <span id="display" style="color: red"></span>
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Mobile</label> <input
				type="number" class="form-control" name="mobile" id="userMobile" value="${dto.mobile}" required="required"
				placeholder="Enter mobile no" onchange="onMobile()"/>
				<span id="mobileError" style="color: red"></span>
				<span id="displayUserMobile" style="color: red"></span>
		</div>
		 <div class="mb-3">
			<label for="formFile" class="form-label">User Id</label> <input
				type="text" class="form-control" name="userId" id="userId" value="${dto.userId}"required="required"
				placeholder="Enter user Id" onchange="onUserId()"/>
				<span id="userIdError" style="color: red;"></span>
				<span id="displayUserName" style="color: red"></span>
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Set Profile Photo</label> <input
				type="file" class="form-control" name="bhavaChitra" placeholder="Select profile photo"/>
		</div>
		<input type="submit" value="Update" id="submitId" class="btn btn-primary"/>
		</form>
		<script>

		function onUserId(){
			var agreement=document.getElementById('userId');
			var userValue=agreement.value;
			if(userValue!=null && userValue!="" && userValue.length > 4 && userValue.length < 20)
			{
				var agreement=document.getElementById('agreementId');
				if(agreement.checked){
					document.getElementById('submitId').disabled=false;
					}
				document.getElementById('userIdError').innerHTML='';
				}else{
					document.getElementById('submitId').disabled='disabled';
					document.getElementById('userIdError').innerHTML='Invalid userId,please enter min 4 and max 20';
				}

		const xhttp = new XMLHttpRequest();
		console.log('Running in ajax');
		console.log(userValue);
		xhttp.open("GET", "http://localhost:8088/xworkz-shashank-commonModule/userId/"+ userValue);
		xhttp.send();
		xhttp.onload = function() {
			console.log(this);
			document.getElementById("displayUserName").innerHTML = this.responseText
		}
	}
		<!--Email validation-->

		function onEmail(){
			var userEmail = document.getElementById('emailId');
			var userEmailvalue = userEmail.value;
			console.log(userEmailvalue);
			if (userEmailvalue != null && userEmailvalue != ""
					&& userEmailvalue.length > 4 && userEmailvalue.length < 40) {
				console.log('valid email');
				const xhttp = new XMLHttpRequest();
				console.log('Running in ajax');
				console.log(userEmailvalue);
				xhttp.open("GET", "http://localhost:8088/xworkz-shashank-commonModule/email/"
						+ userEmailvalue);
				xhttp.send();
				xhttp.onload = function() {
					console.log(this);
					document.getElementById("display").innerHTML = this.responseText
				}
				document.getElementById('emailError').innerHTML = '';
			} else {
				console.log('invalid email');
				document.getElementById('emailError').innerHTML = 'Plese enter valid email min 4 and max 40 charactes ';
			}
		}
			
			<!--Mobile number validation-->
			
			function onMobile(){
				var userMobile = document.getElementById('userMobile');
				var userMobilevalue = userMobile.value;
				console.log(userMobilevalue);
				if (userMobilevalue != null && userMobilevalue != ""
						&& userMobilevalue.length == 10) {
					console.log('valid mobile');
					const xhttp = new XMLHttpRequest();
					console.log('Running in ajax');
					console.log(userMobilevalue);
					xhttp.open("GET", "http://localhost:8088/xworkz-shashank-commonModule/mobile/"
							+ userMobilevalue);
					xhttp.send();
					xhttp.onload = function() {
						console.log(this);
						document.getElementById("displayUserMobile").innerHTML = this.responseText
					}
					document.getElementById('mobileError').innerHTML = '';
				} else {
					console.log('invalid mobile');
					document.getElementById('mobileError').innerHTML = 'Plese enter valid Mobile Number digits must be 10';
				}
			}
		</script>
    </div>
</body>
</html>