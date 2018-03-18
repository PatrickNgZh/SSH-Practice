<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
使用getAttribute方法读取<hr/>  
      
用户名：<%=request.getAttribute("user")%><hr/>
密码：<%=request.getAttribute("password")%><hr/>
信息来源： 
    
<% 
	List<String> info=(List<String>)request.getAttribute("message");
 	for(String tmp:info){
 		 out.print(tmp+"&nbsp&nbsp");
 	}
   
%>

</body>
</html>