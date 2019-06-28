<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.Duration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%! private long visitCount = 0;
    private static LocalDateTime start = LocalDateTime.now();
%>
<h2>Ilość odwiedzin strony: <%= ++visitCount%></h2>

<% LocalDateTime now= LocalDateTime.now();

    Duration beetween = Duration.between(start, now);
    out.print(beetween.getSeconds());
%>
</body>
</html>
