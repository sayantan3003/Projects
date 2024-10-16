<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTML Form</title>
</head>
<body>
	<h2>This is a simple HTML Form</h2>
	
	<form action="student-response.jsp">
		<b>First Name: </b>
		<input type="text" name="firstname" />
		<br/><br/>
		<b>Last Name: </b>
		<input type="text" name="lastname" />
		<br/><br/>
		<p>Favourite programming language</p>
		<input type="checkbox" name="language" value="C" /> C
		<input type="checkbox" name="language" value="C++" /> C++
		<input type="checkbox" name="language" value="Java" /> Java
		<input type="checkbox" name="language" value="Python" /> Python
		<br/><br/>
		<p><b>Enter any number to convert it into words:</b></p>
		<input type="number" name="number" />
		<br/><br/>
		<input type="submit" value="submit" />
	</form>
</body>
</html>