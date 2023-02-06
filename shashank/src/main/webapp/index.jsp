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
				alt="" height="48" width="80"> </a>
		</div>
	</nav>
	<h1>Welcome to Button page</h1>
	<form method="get" action="email">
		<h2>Display Email:${emailId}</h2>
		<input type="submit" value="enter for email" />
	</form>
	<form action="phone">
		<h2>Display Phone:${phoneNo}</h2>
		<input type="submit" value="enter for Phone" />
	</form>
	<form action="aadhar">
		<h2>Display Aadhar:${aadharNo}</h2>
		<input type="submit" value="enter for aadhar no" />
	</form>
	<form action="age">
		<h2>Display Age:${age}</h2>
		<input type="submit" value="enter for age" />
	</form>
	<form action="dob">
		<h2>Display DOB:${dateOfBirth}</h2>
		<input type="submit" value="enter for dob" />
	</form>
	<form action="salary">
		<h2>Display Salary:${desiredSalary}</h2>
		<input type="submit" value="enter for salary" />
	</form>
	<form action="besties">
		<h2>Display besties:</h2>
		<input type="submit" value="enter for besties" />
		<ul>
		<c:forEach items="${bestFriends}" var="kuchiku">
		<li>${kuchiku}</li>
		</c:forEach> 
		</ul>
	</form>
	<form action="places">
		<h2>Display places:</h2>
		<input type="submit" value="enter for places" />
		<ul>
		<c:forEach items="${mostVisited}" var="visting">
		<li>${visting}</li>
		</c:forEach> 
		</ul>
	</form>
	<form action="skills">
		<h2>Display skills:</h2>
		<input type="submit" value="enter for skills" />
		<ul>
		<c:forEach items="${skillSet}" var="technical">
		<li>${technical}</li>
		</c:forEach> 
		</ul>
	</form>
	<form action="beverage">
		<h2>Display beverage</h2>
		<input type="submit" value="enter for beverage" /></br>
		<label>Beverage name:${beverageDTO.name}</label></br>
		<label>Beverage price:${beverageDTO.price}</label></br>
		<label>Beverage color:${beverageDTO.color}</label></br>
		<label>Beverage quantity:${beverageDTO.quantity}</label></br>
		<label>Beverage discount:${beverageDTO.discount}</label></br>
		<label>Beverage quality:${beverageDTO.quality}</label></br>
		<label>Beverage stock:${beverageDTO.stock}</label></br>
		<label>Beverage cold:${beverageDTO.cold}</label></br>
	</form>
	<form action="chat">
		<h2>Display chat</h2>
		<input type="submit" value="enter for chat" /></br>
		<label>Chat name:${chatDTO.name}</label></br>
		<label>Chat price:${chatDTO.price}</label></br>
		<label>Chat spicy:${chatDTO.spicy}</label></br>
		<label>Chat tasty:${chatDTO.tasty}</label></br>
		<label>Chat sweet:${chatDTO.sweet}</label></br>
		<label>Chat chatLocation:${chatDTO.chatLocation}</label></br>
		<label>Chat ownerName:${chatDTO.ownerName}</label></br>
		<label>Chat pincode:${chatDTO.pincode}</label></br>
		<label>Chat parcel:${chatDTO.parcel}</label></br>
		<label>Chat shopName:${chatDTO.shopName}</label></br>
		<label>Chat phNo:${chatDTO.phNo}</label></br>
	</form>
	<form action="education">
		<h2>Display education</h2>
		<input type="submit" value="enter for education" /></br>
		<label>Education collegeName:${educationDTO.collegeName}</label></br>
		<label>Education type:${educationDTO.type}</label></br>
		<label>Education principalName:${educationDTO.principalName}</label></br>
		<label>Education pincode:${educationDTO.pincode}</label></br>
		<label>Education phNo:${educationDTO.phNo}</label></br>
		<label>Education since:${educationDTO.since}</label></br>
		<label>Education noOfBranches:${educationDTO.noOfBranches}</label></br>
		<label>Education presidentName:${educationDTO.presidentName}</label></br>
		<label>Education principalPhNo:${educationDTO.principalPhNo}</label></br>
		<label>Education autonomus:${educationDTO.autonomus}</label></br>
	</form>
	<form action="family">
		<h2>Display family</h2>
		<input type="submit" value="enter for family" /></br>
		<label>Family familyName:${familyDTO.familyName}</label></br>
		<label>Family fatherName:${familyDTO.fatherName}</label></br>
		<label>Family phNo:${familyDTO.phNo}</label></br>
		<label>Family villageName:${familyDTO.villageName}</label></br>
		<label>Family motherName:${familyDTO.motherName}</label></br>
		<label>Family noOfMembers:${familyDTO.noOfMembers}</label></br>
		<label>Family villagePincode:${familyDTO.villagePincode}</label></br>
		<label>Family motherPhNo:${familyDTO.motherPhNo}</label></br>
		<label>Family grandFatherAlive:${familyDTO.grandFatherAlive}</label></br>
		<label>Family grandMotherAlive:${familyDTO.grandMotherAlive}</label></br>
	</form>
	<form action="mobile">
		<h2>Display mobile</h2>
		<input type="submit" value="enter for mobile" /></br>
		<label>Mobile name:${mobileDTO.name}</label></br>
		<label>Mobile color:${mobileDTO.color}</label></br>
		<label>Mobile price:${mobileDTO.price}</label></br>
		<label>Mobile RAM:${mobileDTO.RAM}</label></br>
		<label>Mobile dualSim:${mobileDTO.dualSim}</label></br>
	</form>
</body>
</html>