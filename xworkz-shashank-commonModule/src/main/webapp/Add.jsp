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
 			<li style="float:right"><a href="SignIn.jsp">SignIn</a></li>
 			<li style="float:right"><a class="active" href="About.jsp">About</a></li>
		</ul>
		<span style="color: white;">Welcome:${userId}</span>
		  <div align="right">
		  <img src="download?fileName=${dtoPic}" alt="">
		</div>
	</nav>

<div class="signup-box">
    <h1>Welcome to technology add page</h1>
    <span style="color: green">${addTechSuccess}</span>
    <h5 style="color: red;" align="center">
			<c:forEach items="${error}" var="e">${e.message}</c:forEach>
	</h5>
	<form action="addTechnology?id=${id}" method="post">
			
        <div class="mb-3">
			<label for="name" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="name" required="required" 
				placeholder="Enter name" value="${dtos.name}"/>
		</div>
		<div class="mb-3">
			<label for="language" class="form-label">Language</label> <input
				type="text" class="form-control" name="language" id="language" required="required"
				placeholder="Enter language"/>
		</div>
		<div class="mb-3">
			<label for="version" class="form-label">Version</label> <input
				type="text" class="form-control" name="version" id="version" required="required"
				placeholder="Enter version"/>
		</div>
		<div class="mb-3">
			<label for="owner" class="form-label">Owner</label> <input
				type="text" class="form-control" name="owner"  id="owner" required="required"
				placeholder="Enter owner name"/>
		</div>
		<div class="mb-3">
			<label for="supportFrom" class="form-label">Support From</label> <input
				type="date" class="form-control" name="supportFrom" id="supportFrom" required="required"
				placeholder="Enter supportFrom date"/>
		</div>
		<div class="mb-3">
			<label for="supportTo" class="form-label">Support To</label> <input
				type="date" class="form-control" name="supportTo" id="supportTo" required="required"
				placeholder="Enter supportTo date"/>
		</div>
		<div class="mb-3">
			<label for="license" class="form-label">License</label> <input
				type="number" class="form-control" name="license" id="license" required="required"
				placeholder="Enter license"/>
		</div>
		<div class="form-check mb-3">
      	<input class="form-check-input" type="checkbox" id="openSource" name="openSource">
      	<label class="form-check-label">Open Source(if yes,click on Checkbox)</label>
  		</div>
		<div class="mb-3">
			<label for="type" class="form-label">Type</label> <input
				type="text" class="form-control" name="type" id="type" required="required"
				placeholder="Enter type"/>
		</div>
		<input type="submit" value="Add" id="submit"class="btn btn-primary"/>
		</form>	
		<script>
		
		/* function onName(){
			var agreement=document.getElementById('name');
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
					document.getElementById('nameError').innerHTML='Invalid userId,please enter min 4 and max 20';
				}

		const xhttp = new XMLHttpRequest();
		console.log('Running in ajax');
		console.log(userValue);
		xhttp.open("GET", "http://localhost:8088/xworkz-shashank-commonModule/name/"+ userValue);
		xhttp.send();
		xhttp.onload = function() {
			console.log(this);
			document.getElementById("displayName").innerHTML = this.responseText
		} */
		
		
		const name = document.getElementById('name');
		const language = document.getElementById('language');
		const version = document.getElementById('version');
		const owner = document.getElementById('owner');
		const supportFrom = document.getElementById('supportFrom');
		const supportTo = document.getElementById('supportTo');
		const license = document.getElementById('license');
		const openSource = document.getElementById('openSource');
		const OSType = document.getElementById('type');
		const submit = document.getElementById('submit')
		// Add event listeners to the input fields
		name.addEventListener('input', checkFields);
		language.addEventListener('input', checkFields);
		version.addEventListener('input', checkFields);
		owner.addEventListener('input', checkFields);
		supportFrom.addEventListener('input', checkFields);
		supportTo.addEventListener('input', checkFields);
		license.addEventListener('input', checkFields);
		openSource.addEventListener('input', checkFields);
		type.addEventListener('input', checkFields);
		// Function to check if all fields are filled
		function checkFields() {
			if (name.value !== '' && language.value !== ''
					&& version.value !== '' && owner !== ''
					&& supportFrom.value !== '' && license.value !== ''
					&& openSource !== '' && type.value !== '') {
				submit.disabled = false;
			} else {
				submit.disabled = true;
			}
		}
		function setTwoNumberDecimal(event) {
			this.value = parseFloat(this.value).toFixed(5);
		}
		</script>
		</div>
</body>
</html>