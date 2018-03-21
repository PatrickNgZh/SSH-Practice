<%@ page import="com.bean.Student" %>
<%@ page import="com.biz.StudentBiz" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: peicong
  Date: 2018/3/21 0021
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Student> list = null;
    list = new StudentBiz().getAllSelectedInfo("信科");
    for (Student student : list) {
        out.print(student);
    }
%>
</body>
</html>
