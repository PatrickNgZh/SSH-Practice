<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
      String s1=request.getParameter("str1");
      String s2=request.getParameter("str2");
      String s3=request.getParameter("str3");
      String s4=request.getParameter("str4");
%>
<%=s1 %>
<%=s2 %>
<%=s3 %>
<%=s4 %>
</body>
</html>