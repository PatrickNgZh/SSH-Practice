<%--
  Created by IntelliJ IDEA.
  User: peicong
  Date: 2018/3/26 0026
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();
    out.print("<script language='javascript'>" +
            "window.location.href='../index.jsp';" +
            "</script>");
%>
</body>
</html>
