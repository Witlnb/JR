<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/13
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="ShowAddServlet" method="post">
        标   签:<input type="text" name="title">
        <br/>
        招聘信息:<input type="text" name="show">
        <br/>
        公司名称:<input type="text" name="company">
        <br/>
        公司编号:<input type="text" name="companyid">
        <br/>
        <input type="submit" value="发布">
    </form>
</body>
</html>
