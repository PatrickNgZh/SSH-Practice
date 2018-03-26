<%@page import="com.model.User"%>
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
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	User user=new User();
	user.setName(name);
	user.setPassword(password);
	session.setAttribute("user", user);
	response.sendRedirect("/jsp/ShowInformation.jsp");
%>
</body>
</html>