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
	<h1 class="text-center">IPO DETAILS</h1>
	<c:url var="ipoUrl" value="/ipo/save"></c:url>
	<form:form action="${ipoUrl }"  class="jumbotron jumboron-fluid bg-dark text-light" modelAttribute="ipo">
		<table>
			<c:if test="${!empty ipo.companyName }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" />
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<div class="form-group">
					<td><form:label path="companyName">Company name</form:label></td>
					<td><form:input class="form-control" path="companyName"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="stockExchange">stockExchange</form:label></td>
					<td><form:input class="form-control" path="stockExchange"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="pricePerShare">pricePerShare</form:label></td>
					<td><form:input class="form-control" path="pricePerShare"></form:input></td>
				</div>
			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="totalStocks">totalStocks</form:label></td>
					<td><form:input class="form-control" path="totalStocks"></form:input></td>
				</div>

			</tr>
			<tr>
				<div class="form-group">
					<td><form:label path="openDateTime">openDateTime</form:label></td>
					<td><form:input class="form-control" path="openDateTime"></form:input></td>
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
				<td><c:if test="${empty ipo.companyName}">
						<input type="Submit" value="Register" />
					</c:if> <c:if test="${!empty ipo.companyName}">
						<input type="Submit" value="Update" />
					</c:if></td>
			</tr>
		</table>

	</form:form>
	<br />
	<hr />


	<table class="table table-dark">
		<tr>
			<th>ID</th>
			<th>COMPANY NAME</th>
			<th>OPENDATETIME</th>
			<th>PRICE PER SHARE</th>
			<th>REMARKS</th>
			<th>STOCK EXCHANGE</th>
			<th>TOTAL STOCKS</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="ipo" items="${list}">
			<tr>
				<td>${ipo.id }
				<td>${ipo.companyName }</td>
				<td>${ipo.stockExchange}</td>
				<td>${ipo.pricePerShare }</td>
				<td>${ipo.totalStocks }</td>
				<td>${ipo.openDateTime }</td>
				<td>${ipo.remarks }</td>
				<td><a href="<c:url value='/ipo/remove/${ipo.id }'/>">Delete</a>|
					<a href="<c:url value='/updateipo/${ipo.id }'/> ">Update</a></td>



			</tr>
		</c:forEach>
	</table>


</body>
</html>