<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>
	<s:form action="login" method="post" namespace="/user">
		<s:textfield name="userName" label="用户名"/>
		<s:password name="password" label="密码" />
		<s:submit value="登录"/>
	</s:form>
	<br/>
	<a href="/ch01/user/viewSource">查看本网页的JSP源代码</a>
</body>
</html>