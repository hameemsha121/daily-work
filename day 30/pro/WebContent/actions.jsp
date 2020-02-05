<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<jsp:useBean id="user" class="com.cts.training.bean.LoginBean" scope="page"></jsp:useBean>
<%-- 	<jsp:setProperty property="username" name="user" value="admin007"/>
	<jsp:setProperty property="password" name="user" value="admin#1234"/>
	<hr>--%>
	<jsp:setProperty property="*" name="user"/>
	
	<hr>
	user details are :
	<br>
	username :<jsp:getProperty property="username" name="user"/><br>
	password :<jsp:getProperty property="password" name="user"/>
	
</body>
</html>