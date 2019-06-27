<%@page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>Edytowanie usera</title>
</head>
<body>
<%@include file="../jspf/message.jspf" %>
<%@include file="../jspf/menu.jspf" %>

<form name="editUser" action="/editUser.do" method="post">
    <input type="hidden" name="id" value="${user.id}"/><br/>
    name: <input type="text" name="name" value="${user.name}"/><br/>
    <input type="submit" name="submit" value="Edytuj"/>
</form>

</body>
</html>