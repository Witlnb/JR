<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/13
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${showList}" var="list">
        <p>${list.title}</p>
        <p>${list.company}</p>
        <p>${list.information}</p>
        <p>${list.money}</p>
    </c:forEach>
</body>
</html>
