<%--
  Created by IntelliJ IDEA.
  User: Mariusz
  Date: 25.06.2019
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="errorPage.jsp" %>
<html>
<head>
    <title>name</title>
</head>
<body>
<%

    String name = request.getParameter("name");

//    out.print(name.substring(0,1).toUpperCase() + name.substring(1) );

%>

<h2>Witaj <% out.print(name.substring(0,1).toUpperCase() + name.substring(1)); %>!</h2>



</body>
</html>

<%--if (a == null || a.isEmpty()){  // zachować kolejność--%>
<%--a = "";--%>
<%--}--%>