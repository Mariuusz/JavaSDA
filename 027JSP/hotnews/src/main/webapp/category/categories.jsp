<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kategorie</title>
</head>
<body>

<%@ include file="../common/message.jspf"%>

<h1>Kategorie</h1>

<c:if test="${empty categories}">
    <b style="color: red">Brak kategorii</b>
</c:if>

<c:forEach var="cat" items="${categories}">
    <c:set var="style" value=""/>
    <c:if test="${cat.id eq lastModified}">
        <c:set var="style" value="color: coral"/>
    </c:if>

    <span style="${style}">(${cat.id}) <a href="/edit_categories.html?id=${cat.id}">${cat.name}</a></span> <br />
</c:forEach>
<br />
<a href="new_categories.html">dodaj nową kategorię</a>
</body>
</html>
