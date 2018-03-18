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
	String name;
	String pwd;
%>
<%
	Cookie[] cookies=request.getCookies();
	
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("name")){
			name=cookie.getValue();
		}
		if(cookie.getName().equals("pwd")){
			pwd=cookie.getValue();
		}
	}
	
	if(name==null){
		name="";
	}
	
	if(pwd==null){
		pwd="";
	}
	
 %>
<form action="b2.jsp">
用户名：<input type="text" name="username" value="<%=name %>">
<br>
密码：<input type="password" name="pwd" value="<%=pwd %>">
<br>
<input type="submit" value="确认">
</form>
</body>
</html>