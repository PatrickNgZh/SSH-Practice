<%--
  Created by IntelliJ IDEA.
  User: peicong
  Date: 2018/3/5 0005
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JudgeScore</title>
</head>
<body>
<%! public String judgeScore(int score){
    char degree='0';
    if(score<=100&&score>=90){
        degree = 'a';
    } else if (score<90&&score>=70) {
        degree = 'b';
    } else if (score < 70 && score >= 60) {
        degree = 'c';
    } else {
        degree = 'd';
    }
    switch (degree){
        case 'a':
            return "\"你的成绩为优秀!\"";
        case 'b':
            return "\"你的成绩为良好!\"";
        case 'c':
            return "\"你的成绩为及格!\"";
        case 'd':
            return "\"你的成绩为不及格!\"";
        default:
            return "\"请输入合法数据\"";
    }
}%>
假设成绩是93，则输出
<%=judgeScore(93)%>
</body>
</html>
