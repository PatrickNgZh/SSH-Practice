<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		background: yellow;
		text-align: center;
	}
	.myred{
		color: red;
	}
	.myblue{
		color: blue;
	}
</style>
</head>
<body>
<table border="1" align="center">
    <tr>
        <td rowspan="2" class="myblue">序号</td>
        <td rowspan="2" class="myblue">学号</td>
        <td rowspan="2" class="myblue">姓名</td>
        <td colspan="5" class="myblue">第一学期成绩</td>
    </tr>
    <tr class="myblue">
        <td>英语</td>
        <td>高数</td>
        <td>学科导论</td>
        <td>就业</td>
        <td>总分</td>
    </tr>
    
    <tr>
    	<td>1</td>
    	<td>1019200101</td>
    	<td>李大宇</td>
    	<td>76</td>
    	<td>76</td>
    	<td>76</td>
    	<td>90</td>
    	<td>395</td>
    </tr>
    <tr>
    	<td>2</td>
    	<td>1019200102</td>
    	<td>张子明</td>
    	<td>60</td>
    	<td class="myred">45</td>
    	<td>66</td>
    	<td class="myred">55</td>
    	<td>303</td>
    </tr>
    <tr>
    	<td>3</td>
    	<td>1019200103</td>
    	<td>胡大明</td>
    	<td class="myred">55</td>
    	<td>58</td>
    	<td>64</td>
    	<td>80</td>
    	<td>343</td>
    </tr>
    <tr>
    	<td>4</td>
    	<td>1019200104</td>
    	<td>王不学</td>
    	<td class="myred">34</td>
    	<td>87</td>
    	<td>76</td>
    	<td class="myred">45</td>
    	<td>309</td>
    </tr>
    <tr>
    	<td>5</td>
    	<td>1019200105</td>
    	<td>徐知道</td>
    	<td>67</td>
    	<td>95</td>
    	<td>66</td>
    	<td>90</td>
    	<td>363</td>
    </tr>
    <tr>
    	<td colspan="3" class="myblue">课程平均成绩</td>
    	<td class="myred">58.2</td>
    	<td class="myblue">74.2</td>
    	<td class="myblue">69.6</td>
    	<td class="myblue">72</td>
    	<td class="myblue"></td>
    </tr>
</table>
</body>
</html>