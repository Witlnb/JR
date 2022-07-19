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
        select,option{
            font-size: 30px;
        }
    </style>
</head>
<body class="content-body">
<script type="text/javascript" src="JS/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="JS/MulJq.js"></script>
<div class="show">
<form action="ReviseUserServlet" method="post">
    用&nbsp;&nbsp;户&nbsp;&nbsp;名:<input name="uname" type="text" readonly="readonly" value="${LoginU.uname}" required/>
    <br>
    身&nbsp;&nbsp;份&nbsp;&nbsp;证:<input  name="nid" type="text" readonly="readonly" value="${LoginU.nid}" required/>
    <br>
    性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:<input name="sex" type="text" readonly="readonly" value="${LoginU.sex}" required/>
    <br>
    用户编号:<input name="uid" type="text" readonly="readonly" value="${LoginU.uid}" required/>
    <br>
    密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="upwd" value="${LoginU.upwd} " required>
    <span class="spidOne"></span>
    <br>
    手&nbsp;&nbsp;机&nbsp;&nbsp;号:<input type="text" name="phone" value="${LoginU.phone}" required>
    <span class="spid"></span>
    <br>
    邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:<input type="text" name="email" value="${LoginU.email}" required>
    <span class="spid"></span>
    <br>
        学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<select name="study" required>
        <option value="${LoginU.study}" selected="selected">${LoginU.study}</option>
        <option value="初中及以下">初中及以下</option>
        <option value="高中">高中</option>
        <option value="中专/中技">中专/中技</option>
        <option value="大专">大专</option>
        <option value="本科">本科</option>
        <option value="硕士">硕士</option>
        <option value="博士">博士</option></select>
        <span class="spid"></span>
    <br>
    工作经验:<select name="job" required>
    <option value="${LoginU.job}" selected="selected">${LoginU.job}</option>
    <option value="无经验">无经验</option>
    <option value="一年以下">一年以下</option>
    <option value="1-3年">1-3年</option>
    <option value="3-5年">3-5年</option>
    <option value="5-10年">5-10年</option>
    <option value="10年以上">10年以上</option></select>
    <span class="spid"></span>
    <br>
    住&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:<input type="text" name="address" value="${LoginU.address}" required>
    <span class="spid"></span>
    <br>
    简&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<input type="text" name="personal" value="${loginU.personal}" required>
    <span class="spid"></span>
    <br>
    <input type="submit" value="提交" name="button" class="show1">
    <span></span>
</form>
</div>
</body>
</html>
