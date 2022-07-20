<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/19
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    用户编号:${sessionScope.uid.uid}<br/>
    评论内容:${sessionScope.uid.cmtscontent}<br/>
    发布时间:${sessionScope.uid.cmtstime}
</body>
</html>
