<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie kategorii</title>
</head>
<body>

<%@ include file="../common/message.jspf"%>

<h1>Dodawanie kategorii</h1>

<form action="add_categories.html" method="post">
    Nazwa: <input type="text" name="name" /><br />
    <input type="submit" value="dodaj" />
</form>

</body>
</html>
