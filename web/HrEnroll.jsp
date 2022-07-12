<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/12
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="HrEnrollServlet" method="post">
        公司名称:<input type="text" name="company"><br>
        公司信息:<textarea name="cshow"></textarea><br>
        预计薪资:<input type="text" name="hmoney"><br>
        地址:<input type="text" name="caddress"><br>
        手机号:<input type="tel" name="phone"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
