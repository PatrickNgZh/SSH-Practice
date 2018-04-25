<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>通知公告列表</title>
    <link href="css/ncss_style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<table border="1">
    <tr>
        <td>通知标题</td>
        <td>操作</td>
    </tr>

    <s:if test="list.size!=0&&list!=null">

        <s:iterator value="list" status="st" var="item">
            <s:url id="alterUrl" value="/notice/getInfo.action?typeId" escapeAmp="false">
                <s:param name="typeId"><s:property value="#item.id"/></s:param>
            </s:url>
            <s:url id="deleteUrl" value="/notice/getInfo.action?typeId" escapeAmp="false">
                <s:param name="typeId"><s:property value="#item.id"/></s:param>
            </s:url>
            <s:url id="itemUrl" value="/notice/showDetail.action?id" escapeAmp="false">
                <s:param name="id"><s:property value="#item.id"/></s:param>
            </s:url>
            <tr>
                <td>
                    <s:property value="#item.id"/>&nbsp;&nbsp;
                    <a href="<s:property value="#itemUrl"/>" target="showNotice"><s:property value="#item.title"/></a>
                </td>
                <td>
                    <a href="<s:property value="#itemUrl"/>" target="showNotice">修改</a>
                    &nbsp;&nbsp;
                    <a href="<s:property value="#itemUrl"/>" target="showNotice">删除</a>
                </td>
            </tr>
        </s:iterator>
    </s:if>
    <s:else>
        <tr>
            <td colspan="2">没有记录</td>
        </tr>
    </s:else>

</table>


<%--

	<a href="noticeServlet?method=showAllNotice&pageIndex=1">首页</a>
	<a href="noticeServlet?method=showAllNotice&pageIndex=<%=(Integer)request.getAttribute("pageIndex")-1 %>">上一页</a>
	<a href="noticeServlet?method=showAllNotice&pageIndex=<%=(Integer)request.getAttribute("pageIndex")+1 %>">下一页</a>
	<a href="noticeServlet?method=showAllNotice&pageIndex=<%=request.getAttribute("totalPage") %>">末页</a>
    <%=request.getAttribute("pageIndex") %>/<%=request.getAttribute("totalPage") %>

--%>

</body>
</html>
