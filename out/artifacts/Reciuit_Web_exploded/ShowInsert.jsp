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
        标&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;签:<input type="text" name="title" size="12">
        <br/>
        招聘信息:<select name="show">
            <option value="请选择">请选择</option>
            <option value="java">java</option>
            <option value="java全栈">java全栈</option>
    </select>
        <br/>
        公司名称:<select name="company">
            <option value="请选择">请选择</option>
            <option value="公司1">公司1</option>
            <option value="公司2">公司2</option>
    </select>
        <br/>
        公司编号:<input type="text" name="companyid" size="11">
        <br/>
        薪&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;资:<input type="text" name="money" size="12">
        <br/>
        <input type="submit" value="发布">
    </form>
</body>
</html>
