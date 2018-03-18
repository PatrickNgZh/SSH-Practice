<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="request.jsp">
	<table border=0 align="center">  
		<tr><td>用户名：</td> <td><input type="text" name="user"/></td></tr>
		<tr><td>密&nbsp&nbsp&nbsp&nbsp码：</td> <td><input type="password" name="pwd"/></td></tr>

		<tr >
			<td>您是如何知道本站的：</td>
			<td>
				<input type="checkbox" name="channel" value="报刊">报刊
				<input type="checkbox" name="channel" value="网络">网络
				<input type="checkbox" name="channel" value="朋友推荐">朋友推荐
				<input type="checkbox" name="channel" value="电视">电视		  
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="submit" value="提交"> 
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<input type="reset" name="reset" value="取消"/>
			</td>
		</tr>
	</table>
</form>   

</body>
</html>