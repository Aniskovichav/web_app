<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: st
  Date: 11.07.2024
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars Table</title>
</head>
<body>
<!-- declaration -->
<%!
    int counter = 0;
%>
    <%-- Scriptlet --%>
    <%
        // Java is here
        counter++;
        List<String> cars = (List<String>)request.getAttribute("cars");
        System.out.println("Hello from JSP Scriptlet");
        int x = (int) (Math.random() * 10) + 1;
        response.getWriter().println(x);
    %>
<%-- HTML is here   --%>
<h1>PAGE COUNTER: <%=counter%></h1>
<table border="1">
    <tr>
        <th>NAME</th>
        <th>PRICE</th>
    </tr>
    <%
        for (String car: cars) {%>
    <tr>
        <td> <!-- JSP Expression -->
            <%=car%>
        </td>
        <td> <!-- JSP Expression -->
            <%=((int) (Math.random() * 2000) + 2000)%>
        </td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>
