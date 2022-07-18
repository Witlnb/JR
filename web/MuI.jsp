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
</head>
<body>
<script type="text/javascript" src="JS/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="JS/MulJq.js"></script>
<form action="ReviseUserServlet" method="post">
    用户名:<input name="uname" type="text" readonly="readonly" value="${LoginU.uname}"/>
    <br>
    身份证:<input  name="nid" type="text" readonly="readonly" value="${LoginU.nid}"/>
    <br>
    性别:   <input name="sex" type="text" readonly="readonly" value="${LoginU.sex}"/>
    <br>
    用户编号: <input name="id" type="text" readonly="readonly" value="${LoginU.uid}"/>
    <br>
    密码<input type="text" name="upwd" value="${LoginU.upwd} ">
    <span class="spidOne">one</span>
    <br>
    手机号<input type="text" name="phone" value="${LoginU.phone}">
    <span class="spid"></span>
    <br>
    权限<input type="text" name="mark" value="${loginU.mark}">
    <span class="spid"></span>
    <br>
    邮箱<input type="text" name="email" value="${LoginU.email}">
    <span class="spid"></span>
    <br>
    学历<input type="text" name="study" value="${LoginU.study}">
    <span class="spid"></span>
    <br>
    工作经验<input type="text" name="job" value="${LoginU.job}">
    <span class="spid"></span>
    <br>
    住址<input type="text" name="address" value="${LoginU.address}">
    <span class="spid"></span>
    <br>
    简历<input type="text" name="personal" value="${loginU.personal}">
    <span class="spid"></span>
    <br>
    <input type="button" value="提交" onclick="judge()" name="button">
    <span></span>
</form>
</body>
</html>
