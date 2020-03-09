<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Team Members</title>
</head>
<body>
	Hello, ${firstName} ${lastName}
	<br />
	<br /> Today's date is ${date}

	<br />
	<br /> List of Team Members
	<hr>
	<c:forEach var="temp" items="${teamMembers}">
		${temp} <br/>
	</c:forEach>
</body>
</html>