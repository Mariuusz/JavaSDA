<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="pl.sda.tweet.Tweet" %>
<%@ page import="java.util.*" %>
<%@ page import="pl.sda.tweet.TweetDB" %>
<html lang="pl">
<head>
    <title>Lista tweetów</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h1>Lista tweetów</h1>

<%
    String pinned = request.getParameter("pinned");
    String title = request.getParameter("title");
    String text = request.getParameter("text");

    boolean booleanPinned = false;

    if ("yes".equals(pinned)) {
        booleanPinned = true;
    }

    if (title != null) {
        TweetDB.add(title, text, booleanPinned);
    }

    List<Tweet> tweets = TweetDB.getAll();

    if (tweets.isEmpty()) {
%>Brak tweetów<%
} else {
    for (Tweet t : tweets) {
%># <%
    if (t.isPinned()) {
%><b><%
    }

%><a href="tweet.jsp?id=<%=t.getId() %>"><%=t.getTitle() %></a><%

    if (t.isPinned()) {
%></b><%
    }
%><br /><%
        }
    }

%><br /><br /><a href="addtweet.jsp">dodaj tweeta</a>
</body>
</html>
