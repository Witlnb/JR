<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 11:03
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
<form action="HrReviseServlet" method="post" class="HIshow">
    公司编号:<input type="text" name="companyid" value="${LoginH.companyid}" required readonly="readonly">
    <br>
    金额:<input type="text" name="hmoney" value="${LoginH.hmoney}" required readonly="readonly">
    <br>
    密码:<input type="text" name="cpwd" value="${LoginH.cpwd}" required>
    <br>
    公司信息:<input type="text" name="cshow" value="${LoginH.cshow}" required>
    <br>
    公司名称:<input type="text" name="company" value="${LoginH.company}" required>
    <br>
    公司电话:<input type="text" name="phone" value="${LoginH.phone}" required>
    <br>
    公司地址:<input type="text" name="caddress" value="${LoginH.caddress}" required>
    <br>
    <input type="submit" name="提交" class="submit">
</form>
<a href="HrShow.jsp" class="return"><input type="button" value="返回首页"></a>
</body>
</html>

