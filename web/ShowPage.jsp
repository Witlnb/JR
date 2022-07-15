<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/15
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${page.showList}" var="show">
        <li>${show.sid}|${show.title}|${show.company}|${show.information}|${show.companyid}|${show.money}</li>
    </c:forEach>
</ul>
<a href="ShowReServlet?index=1">首页</a>
<a href="ShowReServlet?index=${page.index - 1}">上一页</a>
<a href="ShowReServlet?index=${page.index + 1}">下一页</a>
<a href="ShowReServlet?index=${page.totalPageCount}">末页</a>
当前${page.index}页
共${page.totalPageCount}页
</body>
</html>
