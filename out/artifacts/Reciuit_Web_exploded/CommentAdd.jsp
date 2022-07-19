<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/17
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="CommentAddServlet" method="post">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="cmtscontent"> 评论内容:</textarea><br/>
    评论作者:<input type="text" name="uid" size="19"><br/>
    发布时间:<input type="text" name="cmtstime" size="19"><br/>
    <input type="submit" value="评论">
</form>
</body>
</html>
