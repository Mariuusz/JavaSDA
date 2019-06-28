<%--
  Created by IntelliJ IDEA.
  User: Mariusz
  Date: 25.06.2019
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userdetails</title>
</head>
<body>

<jsp:useBean id="userinfo" class="pl.sda.zad3.User"></jsp:useBean>
<jsp:setProperty property="*" name="userinfo"/>
Username: <jsp:getProperty property="username" name="userinfo" />
<br />
Password: <jsp:getProperty property="password" name="userinfo" />
<br />
Age: <jsp:getProperty property="age" name="userinfo" />
<br />
Adult: <jsp:getProperty property="adult" name="userinfo" />
<br />

</body>
</html>
