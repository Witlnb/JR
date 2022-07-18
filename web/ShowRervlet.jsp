<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ShowReviseServlet" method="post">
展示id:<input type="text" name="personal" value="${showComp.sid}">
公司id:<input type="text" name="personal" value="${showComp.companyid}">
公司名称:<input type="text" name="personal" value="${showComp.company}}">
标签<input type="text" name="personal" value="${showComp.title}">
招聘信息<input type="text" name="personal" value="${showComp.information}">
期望薪资<input type="text" name="personal" value="${showComp.money}">
<input type="submit" name="提交">
</form>
</body>
</html>
