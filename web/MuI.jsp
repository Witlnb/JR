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
用户名:    身份证:   性别:   用户编号:
    密码<input type="text" name="upwd">
    <span></span>
    <br>
    手机号<input type="text" name="phone">
    <span></span>
    <br>
    权限<input type="text" name="mark">
    <span></span>
    <br>
    邮箱<input type="text" name="email">
    <span></span>
    <br>
    学历<input type="text" name="study">
    <span></span>
    <br>
    工作经验<input type="text" name="job">
    <span></span>
    <br>
    住址<input type="text" name="address">
    <span></span>
    <br>
    简历<input type="text" name="personal">
    <span></span>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
