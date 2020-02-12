<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>
	<%@include file="header.jsp"%>



	<c:url var="userUrl" value="/user/save"></c:url>
	<form:form action="${userUrl }" modelAttribute="user">
		<div></div>


		<table>
			<tr>
				<c:if test="${!empty user.username}">
					<td><form:label path="id">id</form:label></td>
					<td><form:input readonly="true" disabled="true" path="id"></form:input>
						<form:hidden path="id"></form:hidden></td>
			
			</c:if>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="username">Username</form:label></td>
					<td><form:input class="form-control" path="username"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="password">password</form:label></td>
					<td><form:input class="form-control" path="password"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="email">email</form:label></td>
					<td><form:input class="form-control" path="email"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="phone">Phone</form:label></td>
					<td><form:input class="form-control" path="phone"></form:input></td>
				</div>

			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="name">name</form:label></td>
					<td><form:input class="form-control" path="name"></form:input></td>
				</div>
			</tr>

			<tr>
				<td><c:if test="${empty user.username }">
						<input type="submit" value="submit">
					</c:if> <c:if test="${!empty user.username }">
						<input type="submit" value="update">
					</c:if></td>


			</tr>
		</table>
	</form:form>

	<br />
	<hr />
	<table border="1">


		<tr>

			<th>Id</th>
			<th>Email</th>
			<th>Name</th>
			<th>Password</th>
			<th>Phone</th>
			<th>User Name</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="register" items="${list}">
			<tr>
				<td>${register.id }
				</th>
				<td>${register.email }</td>
				<td>${register.name }</td>
				<td>${register.password }</td>
				<td>${register.phone }</td>
				<td>${register.username }</td>
				<td><a href="<c:url value='/remove/${register.id }'/>">Delete</a>|
					<a href="<c:url value='/update/${register.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>