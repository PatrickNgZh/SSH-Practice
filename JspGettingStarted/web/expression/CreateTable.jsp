<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'CreateTable.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
	<%!public String setColor(int num){
	   		if(num%2==0){
	   			return "red";
	   		}else{
	   			return "green";
	   		}
	   } 
	%>
	<table width=200>
		<%
			for (int i = 0; i < 6; i++) {
		%>
		<tr>
			<td bgcolor="<%=setColor(i) %>">第<%=i + 1%>行
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>

</html>
