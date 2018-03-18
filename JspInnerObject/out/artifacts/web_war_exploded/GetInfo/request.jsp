<%@page import="java.util.ArrayList"%>
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
<%
   	request.setCharacterEncoding("utf-8");
   	String name=request.getParameter("user");
   	String pwd=request.getParameter("pwd");
   	String[] channels=request.getParameterValues("channel");
%>
    
你输入的注册信息是：<br>
用户名：<%=name %><br>
密码：<%=pwd %><br>
信息来源：
<%
	if(channels!=null){
		for(int i=0;i<channels.length;i++){
			out.print(channels[i]);
		}
					
	}	
%>
<hr color="red">
 使用setAttribute方法设置属性。<hr>
<%
   List<String> mes=new ArrayList<String>();
   if(channels!=null){
   		for(int i=0;i<channels.length;i++){
   			mes.add(channels[i]);
   		}
			
   }	
  request.setAttribute("user",name);
  request.setAttribute("password",pwd);
  request.setAttribute("message",mes);
%>
<jsp:include page="getAttr.jsp"/>

</body>
</html>