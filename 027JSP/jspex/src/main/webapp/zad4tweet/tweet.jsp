<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="pl.sda.tweet.TweetDB" %>
<%@ page import="pl.sda.tweet.Tweet" %>
<%@ page import="java.util.Optional" %>
<html lang="pl">
<head>
    <title>Tweet</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h1>Tweet</h1>
<%
    String id = request.getParameter("id");
    // TODO: uwaga, tutaj moze byc blad, jesli w id nie bedzie liczby
    int intId = Integer.parseInt(id);

    Optional<Tweet> byId = TweetDB.getById(intId);

    if (!byId.isPresent()) {
%>Brak tweeta o id=<%=intId%><%
} else {
    Tweet tweet = byId.get();
%>
<b><%=tweet.getTitle()%></b><br />
<i><%=tweet.getText()%></i><br />
<small>dodano <%=tweet.getCreatedFormatted()%></small>
<%
    }
%>
<br />
<br />
<a href="tweets.jsp">powrót do listy tweetów</a>
</body>
</html>