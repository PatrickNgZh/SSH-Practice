<%@ page import="com.bean.Student" %>
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
  	request.setCharacterEncoding("utf-8");
	Student student = (Student) request.getAttribute("studentInfo");
    out.print(student.getSno() + "&nbsp;&nbsp;");
    out.print(student.getSname() + "&nbsp;&nbsp;");
    out.print(student.getSsex() + "&nbsp;&nbsp;");
    out.print(student.getSage() + "&nbsp;&nbsp;");
    out.print(student.getSphone() + "&nbsp;&nbsp;");
    out.print(student.getSclass() + "&nbsp;&nbsp;");
%>
</body>
</html>