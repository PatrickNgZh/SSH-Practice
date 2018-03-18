<%--
  Created by IntelliJ IDEA.
  User: peicong
  Date: 2018/3/12 0012
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!int count = 0; %>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("count")) {
            count = Integer.parseInt(cookie.getValue());
            break;
        }
    }
    ++count;
    Cookie cookie = new Cookie("count", Integer.toString(count));
    response.addCookie(cookie);
%>
欢迎<%=session.getAttribute("name")%>进入本页面！
<hr>
第<%=count %>次登陆
</body>
</html>
