<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>User</title>
</head>
<body>
<%@include file="../jspf/menu.jspf"%>

<h2>(${user.id}) ${user.name}</h2>
<h3>
    <a href="/removeUser.do?id=${user.getId()}">usuń</a>&nbsp;
    <a href="/edituser.html?id=${user.id}">edytuj</a>&nbsp;
</h3>

</body>
</html>