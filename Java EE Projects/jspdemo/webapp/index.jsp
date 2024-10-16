<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dassoftware.jsp.*,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.html"></jsp:include>
	
	<h1>Hello World</h1>
	<p>Server time is: <%= new java.util.Date() %></p>
	<br/>
	<p><b><%= "JSP Expression" %></b></p> <!-- Escaping the special characters -->
	<p>&lt;%= JSP Expression %&gt;</p> <!-- Escaping the special characters -->
	<br>
	<p><b><%= "JSP Scriptlet" %></b></p>
	<p>&lt;% JSP Scriptlet %&gt;</p>
	<br>
	<p><b><%= "JSP Declaration" %></b></p>
	<p>&lt;%! JSP Declaration %&gt;</p>
	
	<% 
		for(int i=0;i<5;i++) {
			out.println("<br/>Line " + (i+1));
		}
	%>
	
	<%! 
		// Declare Method
		String reverseString(String inputStr) {
			if("".equalsIgnoreCase(inputStr)) {
				return "";
			}
			return reverseString(inputStr.substring(1)) + inputStr.charAt(0);
		}
	%>
	
	<p>Reverse of <b>String</b> is: <%= reverseString("String") %></p>
	<p>Connect MySql: <br/><%= com.dassoftware.jsp.JSPUtils.connectDataBase() %></p>
	<p>Connect MongoDB: <br/><%= JSPUtils.connectDataBase("MongoDb") %></p>
	
	<p><b>Built in Server Objects</b><p/>
	<table style="border: 1px solid black; border-collapse: collapse;">
    <thead>
        <tr>
            <th style="border: 1px solid black; padding: 8px;">Object</th>
            <th style="border: 1px solid black; padding: 8px;">Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="border: 1px solid black; padding: 8px;"><b>request</b></td>
            <td style="border: 1px solid black; padding: 8px;">Contains HTTP request headers and form data</td>
        </tr>
        <tr>
            <td style="border: 1px solid black; padding: 8px;"><b>response</b></td>
            <td style="border: 1px solid black; padding: 8px;">Provides HTTP support for sending response</td>
        </tr>
        <tr>
            <td style="border: 1px solid black; padding: 8px;"><b>out</b></td>
            <td style="border: 1px solid black; padding: 8px;">JspWriter for including content in HTML page</td>
        </tr>
        <tr>
            <td style="border: 1px solid black; padding: 8px;"><b>session</b></td>
            <td style="border: 1px solid black; padding: 8px;">Unique session for each user of the web application</td>
        </tr>
        <tr>
            <td style="border: 1px solid black; padding: 8px;"><b>application</b></td>
            <td style="border: 1px solid black; padding: 8px;">Shared data for all users of the web application</td>
        </tr>
    </tbody>
</table>

<p><b>Request user agent:</b> <%= request.getHeader("User-Agent") %></p>

<p><b>Request language:</b> <%= request.getLocale() %></p>


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>