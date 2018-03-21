<%@ page import="java.util.List" %>
<%@ page import="com.dao.StudentDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: peicong
  Date: 2018/3/21 0021
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> nameList=new StudentDaoImpl().getAllStudentName();
    for (String name:nameList ) {
        out.print("<a href=\"link3.jsp?name="+name+"\">"+name+"</a>"+"<br>");
    }
%>
</body>
</html>
