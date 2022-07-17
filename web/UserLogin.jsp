<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/12
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<script type="text/javascript" src="JS/jquery-3.6.0.min.js"></script>--%>
<%--<script type="text/javascript" src="JS/MulJq.js"></script>--%>
<body>
    <form action="UserServlet" method="post">
        手机号:<input type="text" name="phone"><br>
        密  码:<input type="password" name="upwd">
        <span></span>
        <br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
