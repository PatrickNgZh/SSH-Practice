<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>通知公告列表</title>
    <link href="css/ncss_style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<s:if test="list.size!=0&&list!=null">

    <s:iterator value="list" status="st" var="item">
        <s:url var="itemUrl" value="/notice/showDetail.action?id" escapeAmp="false">
            <s:param name="id"><s:property value="#item.id"/></s:param>
        </s:url>

        <a href="<s:property value="#itemUrl"/>" target="showNotice">
            <s:property value="#item.title"/>
        </a>
        <br>
    </s:iterator>
</s:if>
<s:else>
    没有记录
</s:else>
</body>
</html>