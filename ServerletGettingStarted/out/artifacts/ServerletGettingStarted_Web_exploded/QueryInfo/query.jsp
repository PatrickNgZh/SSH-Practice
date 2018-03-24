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
	String message = (String)request.getAttribute("message");
	if(message!=null){
        out.println(message+"<br>");
	}
 %>
<form action="CompareServlet" method="post">
	学号：<input type="text" name="studentNo">
	<br>
	<input type="submit" value="提交">
</form>
</body>
</html>