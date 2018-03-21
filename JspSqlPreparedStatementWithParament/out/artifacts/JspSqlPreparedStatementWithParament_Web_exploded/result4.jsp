<%@ page import="com.biz.StudentBiz" %><%--
  Created by IntelliJ IDEA.
  User: peicong
  Date: 2018/3/21 0021
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print(new StudentBiz().getAllSelectedInfo("123"));
%>
</body>
</html>
