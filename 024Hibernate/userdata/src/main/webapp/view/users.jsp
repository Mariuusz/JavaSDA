<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Userzy</title>
    <meta charset="UTF-8">
</head>
<body>
<%@include file="../jspf/message.jspf"%>
<%@include file="../jspf/menu.jspf"%>

<c:if test="${users.size() == 0}">
    Brak userów!
</c:if>
<c:forEach items="${users}" var="user">
    <a href="user.html?id=${user.getId()}">
    <c:choose>
        <c:when test="${newId eq user.id}">
            <div style="font-weight: bold; color: darkorange">
        </c:when>
        <c:otherwise>
            <div>
        </c:otherwise>
    </c:choose>
    (${user.id}) ${user.name}</div></a>
</c:forEach>
<p>
<a href="adduser.html">Dodaj usera</a>
</p>
</body>
</html>
