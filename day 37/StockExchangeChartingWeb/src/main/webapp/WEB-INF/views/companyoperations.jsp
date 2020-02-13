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
	<h1 class="text-center">COMPANY DETAILS</h1>
	<c:url var="companyUrl" value="/company/save"></c:url>
	
	
	<form:form action="${companyUrl }" class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="company">
		<table>
			<c:if test="${!empty company.name }">
				<tr>
					<td><form:label path="id">ID</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" />
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<div class="form-group">
					<td><form:label path="name">COMPANY NAME</form:label></td>
					<td><form:input class="form-control" path="name"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="sector">SECTOR</form:label></td>
					<td><form:input class="form-control" path="sector"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="ceoName">CEO NAME</form:label></td>
					<td><form:input class="form-control" path="ceoName"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="turnOver">TURN OVER</form:label></td>
					<td><form:input class="form-control" path="turnOver"></form:input></td>
				</div>

			</tr>

			<tr>
				<td></td>
				<td><c:if test="${empty company.name}">
						<input type="Submit" value="Register" />
					</c:if> <c:if test="${!empty company.name}">
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
			<th>Name</th>
			<th>Sector</th>
			<th>Ceo Name</th>
			<th>turnover</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="company" items="${list}">
			<tr>
				<td>${company.id }</td>
				<td>${company.name }</td>
				<td>${company.sector }</td>
				<td>${company.ceoName }</td>
				<td>${company.turnOver }</td>
				<td><a href="<c:url value='/remove?id=${company.id }'/>">Delete</a>
					| <a href="<c:url value='/updatecompany/${company.id }'/> ">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>