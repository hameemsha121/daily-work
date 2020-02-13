<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<%@include file="header.jsp" %>
<hr>
<%-- <ol>
<c:forEach var="name" items="${list}"> 
<li> <h3>${name}</h3></li>
</c:forEach>
</ol> --%>

<h2>COMPANY DETAILS</h2>
 <table class="table table-dark">
 <tr>
<th>Id</th>
<th>Name</th>
<th>Sector</th>
<th>Ceo Name</th>
<th>turnover</th>
</tr>
<c:forEach var="company" items="${list}"> 
<tr>
<td>${company.id }</td>
<td>${company.name }</td>
<td>${company.sector }</td>
<td>${company.ceoName }</td>
<td>${company.turnOver }</td>
</tr>
</c:forEach>
</table>
 
 
<hr>
${message}

</body>
</html>
 