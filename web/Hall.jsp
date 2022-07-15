<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/14
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <script src="JS/jquery-3.6.0.js" type="text/javascript"></script>
    <meta charset="UTF-8">
    <title>下拉搜索</title>
    <script src="JS/Hall.js" type="text/javascript"></script>
    <style>
        .iput {
            height: 25px;
            width: 200px;
            padding-left: 5px;
        }

        .iop {
            height: 25px;
            margin-left: 5px;
        }

        .iop:hover {
            background-color: #1E90FF;
        }

        .op-list {
            border: solid 1px #767676;
            width: 209px;
            height: 125px;
            overflow-y: auto;
        }

        ::-webkit-scrollbar {
            /*隐藏滚轮*/
            display: none;
        }

        .hidden {
            display: none;
        }
    </style>
</head>

<body>
<div><input class="iput" placeholder="请点击或输入搜索字段..." onclick="showOption()" oninput="search(this.value)"
            onporpertychange="search(this.value)" onchange="search(this.value)"></div>
<div class="op-list hidden">
    <div class="iop">--请选择--</div>
    <div class="iop">2000</div>
    <div class="iop">3000</div>
    <div class="iop">4000</div>
    <div class="iop">5000</div>
    <div class="iop">6000</div>
</div>
<div id="ShowAll">
    <c:forEach items="${iop}" var="money">
        ${money.title}
        ${money.information}
        ${money.company}
        ${money.money}<br>
    </c:forEach>
</div>
</body>
</html>
