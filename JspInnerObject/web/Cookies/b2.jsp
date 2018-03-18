<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
    Cookie nameCookie;
    Cookie passwordCookie;
%>

<%
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("username");
	String pwd=request.getParameter("pwd");
	if(name.equals("admin")&&pwd.equals("123456")){
		nameCookie=new Cookie("name",name);
		response.addCookie(nameCookie);
		passwordCookie=new Cookie("pwd",pwd);
		response.addCookie(passwordCookie);
		out.print("登陆成功");
	}else{
		out.print("登陆失败");
	}
%>
<br>
<%=nameCookie.getValue() %>
<br>
<%=passwordCookie.getValue() %>
</body>
</html>