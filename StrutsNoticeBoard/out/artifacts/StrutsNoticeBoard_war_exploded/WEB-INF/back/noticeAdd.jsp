<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>添加通知公告</title>
    <link rel="stylesheet" href="css/ncss_style.css" type="text/css"/>
    <script type="text/javascript" language="javascript">
        function checkNotice() {
            var title = form1.title.value;
            if ((title == null) || (title == "")) {
                alert("请填写标题！");
                return false;
            }
            var editor = form1.editor.value;
            if ((editor == null) || (editor == "")) {
                alert("请填写作者！");
                return false;
            }
            var content = form1.content.value;
            if ((content == null) || (content == "")) {
                alert("请填写内容！");
                return false;
            }
            var createTime = form1.createTime.value;
            if ((createTime == null) || (createTime == "")) {
                alert("请填写发布时间！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<form method="post" name="form1" action="/back/addNotice.action" onsubmit="javascript: return checkNotice();">
    <table>
        <tr>
            <td>标题:</td>
            <td><input type="text" name="title" size="35" value=""/></td>
        </tr>
        <tr>
            <td>发布时间:</td>
            <td><input type="text" name="createTime" size="35" value="" placeholder="输入格式YYYYMMDD"/></td>
        </tr>
        <tr>
            <td>作者:</td>
            <td><input type="text" name="editor" size="35" value=""/></td>
        </tr>
        <tr>
            <td>内容:</td>
            <td><textarea name="content" rows="10" cols="30"></textarea></td>
        </tr>
        <tr>
            <td> 类型:</td>
            <td>
                <select name="type">
                    <s:iterator value="list" status="st" var="item">
                        <option value=" <s:property value="#item.id"/>">
                            <s:property value="#item.typeName"/>
                        </option>
                    </s:iterator>
                </select>
            </td>
        </tr>
        <tr>
            <input type="hidden" name="method" value="addNotice"/>
            <td><input type="submit" value="提交" name="submit"/></td>
            <td><input type="reset" value="重置" name="reset"/></td>
        </tr>
    </table>
</form>
</body>
</html>
