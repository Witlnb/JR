<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/12
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="Css/Enroll.css" rel="stylesheet" type="text/css">
    <style type="text/css">
        .show{
            position: absolute;
            top: 300px;
            left: 740px;
            font-size: 30px;
        }
        .show1{
            font-size: 30px;
        }
        input{
            font-size: 30px;
        }
    </style>
</head>
<body class="content-body">
<script type="text/javascript" src="JS/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="JS/MulJq.js"></script>
<div class="show">
<form action="ReviseUserServlet" method="post">
    用&nbsp;&nbsp;户&nbsp;&nbsp;名:<input name="uname" type="text" readonly="readonly" value="${LoginU.uname}"/>
    <br>
    身&nbsp;&nbsp;份&nbsp;&nbsp;证:<input  name="nid" type="text" readonly="readonly" value="${LoginU.nid}"/>
    <br>
    性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:<input name="sex" type="text" readonly="readonly" value="${LoginU.sex}"/>
    <br>
    用户编号:<input name="id" type="text" readonly="readonly" value="${LoginU.uid}"/>
    <br>
    密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="upwd" value="${LoginU.upwd} ">
    <span class="spidOne">one</span>
    <br>
    手&nbsp;&nbsp;机&nbsp;&nbsp;号:<input type="text" name="phone" value="${LoginU.phone}">
    <span class="spid"></span>
    <br>
    权&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;限:<input type="text" name="mark" value="${loginU.mark}">
    <span class="spid"></span>
    <br>
    邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:<input type="text" name="email" value="${LoginU.email}">
    <span class="spid"></span>
    <br>
    学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<input type="text" name="study" value="${LoginU.study}">
    <span class="spid"></span>
    <br>
    工作经验:<input type="text" name="job" value="${LoginU.job}">
    <span class="spid"></span>
    <br>
    住&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:<input type="text" name="address" value="${LoginU.address}">
    <span class="spid"></span>
    <br>
    简&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<input type="text" name="personal" value="${loginU.personal}">
    <span class="spid"></span>
    <br>
    <input type="button" value="提交" onclick="judge()" name="button" class="show1">
    <span></span>
</form>
</div>
</body>
</html>
