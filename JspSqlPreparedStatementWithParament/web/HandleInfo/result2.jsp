<%@ page import="com.dao.StudentDaoImpl" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String no = request.getParameter("no2");
    String name = request.getParameter("title2");
    if (new StudentDaoImpl().insertBasicInfo(no, name) == true) {
        out.print("插入数据成功");
    } else {
        out.print("插入数据失败");
    }
%>
</body>
</html>