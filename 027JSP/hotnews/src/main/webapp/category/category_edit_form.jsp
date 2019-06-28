<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja kategorii</title>
</head>
<body>

<%@ include file="../common/message.jspf"%>

<h1>Edycja kategorii: ${category.name}</h1>

<form action="edit_categories.html" method="post">
    <input type="hidden" name="id" value="${category.id}">
    Nazwa: <input type="text" name="name" value="${category.name}"/><br />
    <input type="submit" value="edytuj" />
</form>

</body>
</html>
