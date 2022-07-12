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
<form action="ReviseUserServlet" method="post">
用户名    身份证   性别
    用户编号<input type="text" value="1" name="uid">
密码<input type="text" name="upwd">
手机号<input type="text" name="phone">
权限<input type="text" name="mark">
邮箱<input type="text" name="email">
学历<input type="text" name="study">
工作经验<input type="text" name="job">
住址<input type="text" name="address">
简历<input type="text" name="personal">
    <input type="submit" value="提交">
</form>
</body>
</html>
