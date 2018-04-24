<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>学校通知公告发布后面管理系统</title>
<link href="/css/ncss_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%--<%--%>
	<%--User loginUser = (User)session.getAttribute("LOGINED_USER");--%>
	<%--if (loginUser==null){--%>
		<%--response.setHeader("Refresh","2;url=../login.jsp");--%>
		<%--out.print("<h2>您还没有登录，请先登录，2秒钟之后跳转到登录页面...</h2>");--%>
	<%--}else{--%>
 <%--%>--%>
<div id="ncss_banner_wrapper">
  <div id="ncss_banner">
    <div id="ncss_banner_image">
      <div id="ncss_banner_image_wrapper"> <br/>
      </div>
    </div>
    <div id="ncss_banner_content">
      <div class="header_01">后台管理系统 &nbsp;
        <a href="/">返回首页</a></div>
        <a href="/logout/logout.action"></a>
    </div>
  </div>
  <!-- end of banner --> 
</div>
<!-- end of banner wrapper -->

<div id="ncss_content_wrapper">
  <div id="ncss_content">
    <div id="column_w300">
      <div class="header_03">通知公告类别</div>
      <div class="column_w300_section_01">
        <div class="notice_image_wrapper"> <img src="/images/ncss_image_02.jpg" alt="image" /> </div>
        <div class="notice_content"> <a href="noticeServlet?method=showAddNotice" target="showNotice">添加通知公告</a> </div>
        <div class="cleaner"></div>
      </div>
      <div class="cleaner"></div>
      <div class="column_w300_section_01 even_color">
        <div class="notice_image_wrapper"> <img src="/images/ncss_image_04.jpg" alt="image" /> </div>
        <div class="notice_content"> <a href="noticeServlet?method=showAllNotice" target="showNotice">通知公告列表</a> </div>
        <div class="cleaner"></div>
      </div>
    </div>
    <div id="column_w530">
      <div class="header_02">欢迎<s:property value="#session.username"/>访问通知公告发布后台管理系统</div>
      <div class="content_section_01">
        <div>
          <iframe name="showNotice" src="noticeServlet?method=showAddNotice" height="300px" width="400px" frameborder="0" marginheight="0" marginwidth="0"  scrolling="auto"/>
        </div>
      </div>
      <div class="cleaner"></div>
    </div>
    <div class="cleaner"></div>
  </div>
  <!-- end of content wrapper --> 
</div>
<!-- end of content wrapper -->

<div id="ncss_footer_wrapper">
  <div class="margin_bottom_20"></div>
  Copyright © 2013 <a href="#">ccec</a> | Designed by <a href="#" target="_parent">JSP WEB</a>
  <div class="cleaner"></div>
</div>
<!-- end of footer -->

</body>
</html>
