<%@page import="java.util.Date"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<%
		Date date=new Date();
		//out.println(date);
		
		
	%>
	<%=date%>
	
	
	<br>
	<%=getSum(3,4)%>
	<%!
		public int getSum(int a, int b){
		return a+b;
	}
	%>
	
	<form action="config.jsp">  
	<input type="text" name="uname">  
	<input type="submit" value="go"><br/>  
	</form> 
	
	

</body>
</html>