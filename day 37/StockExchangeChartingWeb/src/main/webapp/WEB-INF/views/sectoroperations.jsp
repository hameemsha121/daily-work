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
	<h1 class="text-center">SECTOR DETAILS</h1>
	<c:url var="sectorUrl" value="/sector/save"></c:url>
	<form:form action="${sectorUrl }"  class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="sector">
		<table>
			<c:if test="${!empty sector.name }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" />
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
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
				<td></td>
				<td><c:if test="${empty sector.name}">
						<input type="Submit" value="Register" />
					</c:if> <c:if test="${!empty sector.name}">
						<input type="Submit" value="Update" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br />
	<hr />
	<table class="table table-dark">
		<tr>
			<th>Id</th>
			<th>name</th>
			<th>brief</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="sector" items="${list}">
			<tr>
				<td>${sector.id }</td>
				<td>${sector.name }</td>
				<td>${sector.brief }</td>
				<td><a href="<c:url value='/sector/remove/${sector.id }'/>">delete</a>|
				<a href="<c:url value='/updatesector/${sector.id }'/> ">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>