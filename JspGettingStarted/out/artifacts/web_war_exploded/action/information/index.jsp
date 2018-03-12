<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:include page="stuinfo.jsp" flush="true">
	<jsp:param value="赵建国" name="str1"/>
	<jsp:param value="男" name="str2"/>
	<jsp:param value="软件工程" name="str3"/>
	<jsp:param value="20" name="str4"/>
</jsp:include>
</body>
</html>