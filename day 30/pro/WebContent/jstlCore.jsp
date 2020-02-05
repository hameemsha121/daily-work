<%@ include file="header.jsp" %>


<c:out value="Hello World"/>
<br>
<c:set var="name" value="Aneena Thomas"></c:set>
<c:out value="${name}"></c:out>
<c:remove var="name"/>
<br>
name :
<c:out value="${name}"></c:out>

Loop:<br>

<c:forEach var="i" begin="1" end="10" step="1">
		
	<h2>	${i} </h2>
	 <c:if test="${i>2}">
 	<c:out value="polikk"></c:out>
 </c:if>

</c:forEach>

<c:import var="data" url="login.jsp"/>  
<c:out value="${data}"/>  

<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  


  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  

<c:set var="income" scope="session" value="${4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is good.
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
 
 <%-- Loop with Array:<br/>
 <c:forEach var="i" items="[1,11,43,23,53,34]">
 <h2>${i}</h2>

  
 </c:forEach>--%>
 
 
 
 </body>
</html>