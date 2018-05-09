<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>学校通知公告</title>
    <link href="/StrutsNoticeBoard/css/ncss_style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div id="ncss_banner_wrapper">
    <div id="ncss_banner_image"><img src="/StrutsNoticeBoard/images/b.gif" alt="image"/></div>
    <div id="ncss_banner_content">
        <div class="header_01">通知公告发布系统 &nbsp;&nbsp; <a href="/StrutsNoticeBoard/login/login.action">登录后台</a></div>
    </div>
</div>
<!-- end of banner -->

<div id="ncss_content_wrapper">
    <div id="ncss_content">

        <div id="column_w300">
            <div class="header_03">通知公告类别</div>
            <div class="column_w300_section_01">
                <div class="notice_image_wrapper"><img src="/StrutsNoticeBoard/images/ncss_image_03.jpg" alt="image"/></div>
                <div class="notice_content" style="font-size: 15px">
                    <s:if test="list.size!=0&&list!=null">

                        <s:iterator value="list" status="st" var="item">
                            <s:url id="itemUrl" value="/notice/getInfo.action?typeId" escapeAmp="false">
                                <s:param name="typeId"><s:property value="#item.id"/></s:param>
                            </s:url>

                            <a href="<s:property value="#itemUrl"/>" target="showNotice">
                                <s:property value="#item.typeName"/>
                            </a>
                            <br>
                        </s:iterator>
                    </s:if>
                    <s:else>
                        没有公告类别
                    </s:else>
                </div>
                <div class="cleaner"></div>
            </div>
            <div class="cleaner"></div>
        </div>
        <!-- end of column_w300 -->

        <div id="column_w530">

            <div class="header_02">欢迎访问通知公告发布系统&nbsp;现在是<s:property value="date"/></div>
            <div class="content_section_01">
                <div>
                    <iframe name="showNotice" frameborder=0 width=400 height=300 marginheight=0 marginwidth=0
                            scrolling=no src="notice/init"></iframe>
                </div>
            </div>
            <div class="cleaner"></div>
        </div>
        <!-- end of column_w530 -->

        <div class="cleaner"></div>
    </div>
    <!-- end of ncss_content -->

</div>
<!-- end of content wrapper -->

<div id="ncss_footer_wrapper">
    <div class="margin_bottom_15"></div>

    Copyright  2013 <a href="#">ccec</a> | Designed by <a href="#" target="_parent">JSP WEB</a>|该网站的访问量为：<s:property value="#application.count"/>

    <div class="cleaner"></div>
</div>
<!-- end of footer -->
</body>
</html>
