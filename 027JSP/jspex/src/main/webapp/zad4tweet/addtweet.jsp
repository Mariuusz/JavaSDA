<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="pl">
<head>
    <title>Dodawanie tweetów</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>

<form action="tweets.jsp" method="post">
    Tytuł <input type="text" name="title"><br />
    Treść: <textarea name="text"></textarea><br />
    Przypięty? <select name="pinned">
    <option value="no">nie</option>
    <option value="yes">tak</option>
</select><br />
    <input type="submit" value="dodaj">
</form>
<a href="tweets.jsp">powrót do listy tweetów</a>
</body>
</html>