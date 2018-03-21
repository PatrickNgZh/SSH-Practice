<%@ page import="com.bean.Student" %>
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

    Student student = new StudentDaoImpl()
            .getStudentInfoByName(request.getParameter("name"));
%>
<table border="1" align="center">
    <tr>
        <td><%=student.getSno()%></td>
        <td><%=student.getSname()%></td>
        <td><%=student.getSsex()%></td>
        <td><%=student.getSage()%></td>
        <td><%=student.getSphone()%></td>
        <td><%=student.getSclass()%></td>
    </tr>
</table>
</body>
</html>
