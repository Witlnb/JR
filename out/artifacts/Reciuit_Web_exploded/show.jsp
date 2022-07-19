<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/12
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="TitleTest">
    标签<select name="title">
    <option value="">请选择</option>
    <option value="c加加">c++</option>
    <option value="爪哇">java</option>
</select>
    <input value="查询" type="submit">
</form>
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
<form method="post" action="MoneyTitleServlet">
    标签<select name="title">
    <option value="">请选择</option>
    <option value="c加加">c加加</option>
    <option value="爪哇">爪哇</option>
</select>
    薪资<select name="money">
    <option value="0">请选择</option>
    <option value="3000">3000以下</option>
    <option value="4000">4000以下</option>
    <option value="5000">5000以下</option>
    <option value="6000">6000以下</option>
</select>
    <input value="查询" type="submit">
</form>
<form method="post" action="RangeServlet">
    请选择范围<select name="one">
    <option value="0">请选择</option>
    <option value="2000">2000</option>
    <option value="3000">3000</option>
    <option value="4000">4000</option>
    <option value="5000">5000</option>
    <option value="6000">6000</option>
</select>
    <select name="two">
        <option value="0">请选择</option>
        <option value="2000">2000</option>
        <option value="3000">3000</option>
        <option value="4000">4000</option>
        <option value="5000">5000</option>
        <option value="6000">6000</option>
    </select>
    <input value="查询" type="submit">
</form>
</body>
</html>
