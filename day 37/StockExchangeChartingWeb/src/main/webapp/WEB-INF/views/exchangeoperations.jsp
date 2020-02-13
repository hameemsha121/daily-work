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
	<h1 class="text-center">EXCHANGE DETAILS</h1>
	<c:url var="exchangeUrl" value="/exchange/save"></c:url>
	<form:form action="${exchangeUrl }"  class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="exchange">
		<table>
			<c:if test="${!empty exchange.exchangeName}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" />
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<div class="form-group">
					<td><form:label path="exchangeName">exchangeName</form:label></td>
					<td><form:input class="form-control" path="exchangeName"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="contractAddress">contractAddress</form:label></td>
					<td><form:input class="form-control" path="contractAddress"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="brief">brief</form:label></td>
					<td><form:input class="form-control" path="brief"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="remarks">remarks</form:label></td>
					<td><form:input class="form-control" path="remarks"></form:input></td>
				</div>

			</tr>

			<tr>
				<td></td>
				<td><c:if test="${empty exchange.exchangeName}">
						<input type="Submit" value="Submit" />
					</c:if> <c:if test="${!empty exchange.exchangeName}">
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
			<th>ExchangeName</th>
			<th>ContractAddress</th>
			<th>brief</th>
			<th>remarks</th>
			<th>Actions</th>

		</tr>
		<c:forEach var="stock" items="${list}">
			<tr>
				<td>${stock.id }</td>
				<td>${stock.exchangeName }</td>
				<td>${stock.contractAddress }</td>
				<td>${stock.brief }</td>
				<td>${stock.remarks }</td>
				<td><a href="<c:url value='/delete?id=${stock.id }'/>">Delete</a>
					|<a href="<c:url value='/exchangeupdate?id=${stock.id }'/> ">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
