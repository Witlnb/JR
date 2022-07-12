<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/12
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${show}" var="show">
    ${show.sid}<br>
    ${show.title}<br>
    ${show.show}<br>
    ${show.company}<br>
    ${show.companyid}<br>
    ${show.money}<br>
</c:forEach>
</body>
</html>
