<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/18
  Time: 18:13
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
        .ShowALL{
            position: absolute;
            top: 300px;
            left: 740px;
            font-size: 30px;
        }
        input{
            font-size: 30px;
            color: #1E90FF;
        }
        .return{
            position: absolute;
            top: 60px;
            right: 60px;
        }
    </style>
</head>
<body>
<div class="ShowALL">
    公司信息:
    公司编号:${LoginH.companyid}
    <br>
    公司信息:${LoginH.cshow}
    <br>
    公司名称:${LoginH.company}
    <br>
    公司电话:${LoginH.phone}
    <br>
    公司地址:${LoginH.caddress}
    <br>
    <a href="HrRevise.jsp"><input type="button" value="修改信息" ></a>
    <br>
    展示信息:
    展示id:${showComp.sid}
    <br>
    公司名称:${showComp.company}
    <br>
    展示id:${showComp.companyid}
    <br>
    标签${showComp.title}
    <br>
    招聘信息${showComp.information}
    <br>
    期望薪资${showComp.money}
    <br>
    <a href="ShowRervlet.jsp"><input type="button" value="修改信息"></a>
</div>
<a href="HrShow.jsp" class="return"><input type="button" value="返回首页"></a>
</body>
</html>