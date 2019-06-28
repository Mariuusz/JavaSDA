<%--
  Created by IntelliJ IDEA.
  User: Mariusz
  Date: 25.06.2019
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>errorPage</title>
</head>
<body>

<h3>Due to following reasons an error has occurred</h3>
<ul>
    <li><%=exception.getClass() %></li>
    <li><%=exception.getMessage() %></li>
</ul>

</body>
</html>
