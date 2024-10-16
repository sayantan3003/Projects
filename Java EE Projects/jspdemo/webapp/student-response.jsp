<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dassoftware.jsp.*,java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
	<h2>Student Details</h2>
	<p>Name: <%= request.getParameter("firstname") %> <%= request.getParameter("lastname") %> </p>
	<p>In an alternative way...</p>
	<p>Name: ${param.firstname} ${param.lastname}</p>
	<p>
		Favourite Programming Language: 
		<%
			out.println("<ol>");
			String[] favProgLangs = request.getParameterValues("language");
			
			if(favProgLangs != null) {
				for(var language: favProgLangs) {
					out.println("<li>" + language + "</li>");
				}
			}
			
			out.println("</ol>");
		%>
	</p>
	<br/><br/>
	<% String number = request.getParameter("number"); %>
	<p><b>You have entered: </b> <%= number %></p>
	<p><b>After conversion it is: </b> <%= JSPUtils.convertNumberIntoWords(number) %></p>
	
</body>
</html>