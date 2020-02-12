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
	<hr>
	<c:url var="sectorUrl" value="/sector/save"></c:url>
	<form:form action="${sectorUrl }" modelAttribute="sector">
		<table>
			<tr>
				<div class="form-group">
					<td><form:label path="name">name</form:label></td>
					<td><form:input class="form-control" path="name"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="brief">brief</form:label></td>
					<td><form:input class="form-control" path="brief"></form:input></td>
				</div>
			</tr>


			<tr>
				<td><button type="submit">submit</button></td>


			</tr>
		</table>
	</form:form>
	<br />
	<hr />
	<table border="1">
		<tr>
			<th>Id</th>
			<th>name</th>
			<th>brief</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="sector" items="${list}">
			<tr>
				<td>${sector.id }
				</td>
				<td>${sector.name }</td>
				<td>${sector.brief }</td>
				<td><a href="<c:url value='/sector/remove/${sector.id }'/>">delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>