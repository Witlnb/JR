<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="ShowMoneyServlet">
    薪资<select name="money">
    <option value="0">请选择</option>
    <option value="3000">3000以下</option>
    <option value="4000">4000以下</option>
    <option value="5000">5000以下</option>
    <option value="6000">6000以下</option>
</select>
<input value="查询" type="submit">
</form>
</body>
</html>
