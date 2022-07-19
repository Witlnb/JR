<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body{
            background-image: url("Img/蓝白背景.png");
        }
        .HIshow{
            position: absolute;
            top: 300px;
            left: 740px;
            font-size: 30px;
        }
        .submit{
            font-size: 30px;
        }
        input{
            font-size: 30px;
        }
        textarea{
            font-size: 30px;
        }
        .return{
            position: absolute;
            top: 60px;
            right: 60px;
        }
    </style>
</head>
<body>
<form action="ShowReviseServlet" method="post" class="HIshow">
展示id:<input type="text" name="sid" value="${showComp.sid}" required readonly="readonly">
    <br>
公司id:<input type="text" name="companyid" value="${showComp.companyid}" required readonly="readonly">
    <br>
公司名称:<input type="text" name="company" value="${showComp.company}}" required>
    <br>
标签<input type="text" name="title" value="${showComp.title}" required>
    <br>
招聘信息<input type="text" name="information" value="${showComp.information}" required>
    <br>
期望薪资<input type="text" name="money" value="${showComp.money}" required>
    <br>
<input type="submit" name="提交" class="submit">
</form>
<a href="HrShow.jsp" class="return"><input type="button" value="返回首页"></a>
</body>
</html>
