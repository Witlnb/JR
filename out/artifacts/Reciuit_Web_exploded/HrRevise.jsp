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
    </style>
</head>
<body>
<form action="HrReviseServlet" method="post" class="HIshow">
    公司编号:${LoginH.companyid}
    <br>
    公司信息:<input type="text" name="cshow" value="${LoginH.cshow}">
    <br>
    公司名称:<input type="text" name="company" value="${LoginH.company}">
    <br>
    公司电话:<input type="text" name="phone" value="${LoginH.phone}">
    <br>
    公司地址:<input type="text" name="caddress" value="${LoginH.caddress}">
    <br>
    <input type="submit" name="提交" class="submit">
</form>
</body>
</html>


