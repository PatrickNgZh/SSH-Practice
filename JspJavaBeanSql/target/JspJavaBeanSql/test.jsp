<%@page import="com.bean.NoticeType" %>
<%@page import="com.biz.TypeBiz" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
通知公告类别：
<br>
<%
    TypeBiz typeBiz = new TypeBiz();
    List<NoticeType> list = typeBiz.getAllNoticeType();
    for (NoticeType noticeType : list) {
        out.print(noticeType);
        out.print("<br>");
    }
%>
</body>
</html>