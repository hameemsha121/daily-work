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
</ol>
 --%>
<h2>SECTOR DETAILS</h2>
 <table class="table table-dark">
 <tr>
<th>Id</th>
<th>name</th>
<th>brief</th>

</tr>
<c:forEach var="sector" items="${list}"> 
<tr>
<td>${sector.id }</th>
<td>${sector.name }</td>
<td>${sector.brief }</td>

</tr>
</c:forEach>
</table>
 
 
<hr>
<%-- ${message} --%>

</body>
</html>
