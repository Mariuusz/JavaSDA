<%@ page import="java.time.DayOfWeek"%><%@ page import="java.time.LocalDate"%><%@ page contentType="application/json"%>
<% DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();%>
{"name":"Jan", "surname":"Kowalski", "age":45, "dayOfWeek": "<%=dayOfWeek%>"}