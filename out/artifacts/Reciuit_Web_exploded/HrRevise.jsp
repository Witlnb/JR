<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="HrReviseServlet" method="post">
公司编号:${LoginH.companyid}
公司信息:<textarea name="cshow" rows="5" cols="30"></textarea>
公司名称:<input type="text" name="company" value="${LoginH.company}">
公司电话:<input type="text" name="phone" value="${LoginH.phone}">
公司地址:<input type="text" name="caddress" value="${LoginH.caddress}">
    <input type="submit" name="提交">
</form>
</body>
</html>
