<%@page import="com.xworkz.commonModules.dto.TechnologyDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
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
	<h1 style="color: navy;" align="center">Technology(s) List</h1>
	<h2>Name: <a style="color: gray;"> ${dto.userId}</a></h2>
	<h2>Email: <a style="color: gray;"> ${dto.email}</a></h2>
	<h2>Total no. of technologies : <a style="color: gray;"> ${dtos.size()}</a></h2>
	<input type="text" id="search-input" onchange="filterTable()"
			placeholder="Search...">
	<div>
	<!-- <input type="text" id="searchInput" placeholder="Search...">
		<button onchange="search()">Search</button>
	<button onchange="restoreOrder()">Restore order</button> -->
	<table class="table table-bordered">
	<tr>
	<th onclick="sortByName()">Name</th>
	<th onclick="sortByLanguage()">Language</th>
	<th onclick="sortByVersion()">Version</th>
	<th onclick="sortByOwner()">Owner</th>
	<th onclick="sortBySupportFrom()">SupportFrom</th>
	<th onclick="sortBySupportTo()">SupportTo</th>
	<th onclick="sortByLicense()">License</th>
	<th onclick="sortByOpenSource()">OpenSource</th>
	<th onclick="sortByOSType()">Type</th>
	</tr>
	<c:forEach items="${dtos}" var="f">
	<tr>
	<td>${f.name}</td>
	<td>${f.language}</td>
	<td>${f.version}</td>
	<td>${f.owner}</td>
	<td>${f.supportFrom}</td>
	<td>${f.supportTo}</td>
	<td>${f.license}</td>
	<td>${f.openSource}</td>
	<td>${f.type}</td>
	</tr>
	</c:forEach>
		</table>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
	<script>
	
	function filterTable() {
		var value = $('#search-input').val().toLowerCase();
		$('table tbody tr').filter(
				function() {
					$(this).toggle(
						$(this).text().toLowerCase().indexOf(value) > -1)
				});
	}
	function search() {
		var searchValue = $('#searchInput').val().trim().toUpperCase();
		$('table tbody tr').each(function() {
			var rowValue = $(this).text().toUpperCase();
			if (rowValue.indexOf(searchValue) >= 0) {
				$(this).css('background-color', 'green');
			} else {
				$(this).css('background-color', '');
			}
		});
	}
	 // Define a variable to store the original order of the rows
	var originalRows = $('table tbody tr').get();
	// Get the table rows and convert them to an array
	var rows = $('table tbody tr').get();
	function sortByName() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var nameA = $(a).find('td:first').text().toUpperCase();
			var nameB = $(b).find('td:first').text().toUpperCase();
			return nameA.localeCompare(nameB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortByLanguage() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var languageA = $(a).find('td:eq(1)').text().toUpperCase();
			var languageB = $(b).find('td:eq(1)').text().toUpperCase();
			return languageA.localeCompare(languageB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortByVersion() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var versionA = $(a).find('td:eq(2)').text().toUpperCase();
			var versionB = $(b).find('td:eq(2)').text().toUpperCase();
			return versionA.localeCompare(versionB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortByOwner() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var ownerA = $(a).find('td:eq(3)').text().toUpperCase();
			var ownerB = $(b).find('td:eq(3)').text().toUpperCase();
			return ownerA.localeCompare(ownerB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortBySupportFrom() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var supportFromA = $(a).find('td:eq(4)').text().toUpperCase();
			var supportFromB = $(b).find('td:eq(4)').text().toUpperCase();
			return supportFromA.localeCompare(supportFromB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortBySupportTo() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var supportToA = $(a).find('td:eq(5)').text().toUpperCase();
			var supportToB = $(b).find('td:eq(5)').text().toUpperCase();
			return supportToA.localeCompare(supportToB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortByLicense() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var licenseA = $(a).find('td:eq(6)').text().toUpperCase();
			var licenseB = $(b).find('td:eq(6)').text().toUpperCase();
			return licenseA.localeCompare(licenseB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortByOSType() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var OSTypeA = $(a).find('td:eq(7)').text().toUpperCase();
			var OSTypeB = $(b).find('td:eq(7)').text().toUpperCase();
			return OSTypeA.localeCompare(OSTypeB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function sortByOpenSource() {
		// Sort the rows based on the text content of the first column
		rows.sort(function(a, b) {
			var openSourceA = $(a).find('td:eq(8)').text().toUpperCase();
			var openSourceB = $(b).find('td:eq(8)').text().toUpperCase();
			return openSourceA.localeCompare(openSourceB);
		});
		// Reorder the rows in the table
		$.each(rows, function(index, row) {
			$('table tbody').append(row);
		});
	}
	function restoreOrder() {
		// Reorder the rows in the table to the original order
		$.each(originalRows, function(index, row) {
			$('table tbody').append(row);
		});
	}
</script>
</body>
</html>