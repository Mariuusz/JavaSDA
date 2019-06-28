<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Panel</title>
</head>
<body>

<%
    String loginKeyNameInSession = "user_login";
    String action = request.getParameter("_action");

    if ("login".equals(action)) {
        // wykonuje logowanie czyli dodanie loginu do sesji
        String loginFromRequest = request.getParameter("login");
        if (null != loginFromRequest && !loginFromRequest.isEmpty()) {
            session.setAttribute(loginKeyNameInSession, loginFromRequest);
        }
    } else if ("logout".equals(action)) {
        // wykonuje wylogowanie czyli usuniecie loginu z sesji
        session.removeAttribute(loginKeyNameInSession);
    }

    // prezentujemy stan aplikacji i sprawdzam czy jest login w sesji
    String loginFromSession = (String) session.getAttribute(loginKeyNameInSession);

    // a) jesli jest, to pisze np. "Witaj, Heniek!"
    //      i prezentuje formularz wylogowywania
    if (loginFromSession != null) {
        out.print("Witaj, " + loginFromSession + "!<br />");
%>
<form action="user_panel.jsp" method="post">
    <input type="hidden" name="_action" value="logout">
    <input type="submit" value="wyloguj">
</form>
<%
} else {
%>
<form action="user_panel.jsp" method="post">
    Podaj login: <input type="text" name="login"><br />
    <input type="hidden" name="_action" value="login">
    <input type="submit" value="zaloguj">
</form>
<%
    }
%>
</body>
</html>