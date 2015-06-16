<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%-- GIVES 503 ERROR
	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>

<!--  STYLES -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<center>
		<h2>Messaging App</h2>

		<div class="jumbotron">
			<h1>My First Bootstrap Page</h1>
			<p>Resize this responsive page to see the effect!</p>
		</div>

		<h3>
			<a href="hello?name=Vasim">Click Me</a><br>
			<a href="addUser">Click Here to add User</a><br>
		</h3>
	</center>
</body>

<!-- SCRIPTS -->
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</html>