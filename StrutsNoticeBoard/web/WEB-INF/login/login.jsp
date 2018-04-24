<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title></title>
</head>
<body>
<s:property value="#session.username"/>
<s:property value="#session.errorMsg"/>
<form action="/login/vertify.action" method="post">
    用户名：<input type="text" name="name"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>

<s:form action="" method="POST">
    <s:textfield name="username" key="username" size="20"/>
    <s:password name="password" key="password" size="20"/>
    <s:submit key="loginBtn"/>
</s:form>
</body>
</html>