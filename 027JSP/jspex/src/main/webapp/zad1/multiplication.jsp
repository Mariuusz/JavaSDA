<table border="1">

    <%@include file="header.jspf" %>
    <%
        for (int i = 1; i<=10; i++) {
    %>
    <tr>
        <%
            for (int j=1; j<=10; j++) {
        %>

        <td><%=i*j %></td>

        <% } %>
        <% } %>
    </tr>
</table>

<%@include file="footer.jspf" %>