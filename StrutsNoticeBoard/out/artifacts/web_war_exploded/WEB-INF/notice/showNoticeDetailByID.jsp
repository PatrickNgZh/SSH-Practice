<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>通知公告内容</title>
    <link href="css/ncss_style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<s:if test="notice!=null">
    标题：<s:property value="notice.title"/>
    <br>
    作者：<s:property value="notice.editor"/>
    <br>
    时间：<s:property value="notice.createTime"/>
    <br>
    内容：<s:property value="notice.content"/>
</s:if>
<s:else>
    <div>对应通知公告没有找到或已删除！</div>
</s:else>

</body>
</html>