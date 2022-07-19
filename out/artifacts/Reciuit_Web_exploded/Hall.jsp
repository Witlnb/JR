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
        .title {
            height: 25px;
            width: 200px;
            padding-left: 5px;
        }

        .st {
            height: 25px;
            margin-left: 5px;
        }

        .st:hover {
            background-color: #1E90FF;
        }

        .showTitle {
            border: solid 1px #767676;
            width: 209px;
            height: 125px;
            overflow-y: auto;
        }
        .one {
            height: 25px;
            width: 200px;
            padding-left: 5px;
        }

        .o {
            height: 25px;
            margin-left: 5px;
        }

        .o:hover {
            background-color: #1E90FF;
        }

        .First {
            border: solid 1px #767676;
            width: 209px;
            height: 125px;
            overflow-y: auto;
        }
        /*.two {*/
            /*height: 25px;*/
            /*width: 200px;*/
            /*padding-left: 5px;*/
        /*}*/

        /*.p {*/
            /*height: 25px;*/
            /*margin-left: 5px;*/
        /*}*/

        /*.p:hover {*/
            /*background-color: #1E90FF;*/
        /*}*/

        /*.Second {*/
            /*border: solid 1px #767676;*/
            /*width: 209px;*/
            /*height: 125px;*/
            /*overflow-y: auto;*/
        /*}*/

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
    <div class="iop">0</div>
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
<div><input class="title" placeholder="请点击或输入搜索字段..." onclick="showTT()" oninput="test(this.value)"
            onporpertychange="test(this.value)" onchange="test(this.value)"></div>
<div class="showTitle hidden">
    <div class="st">--请选择--</div>
    <div class="st">c加加</div>
    <div class="st">爪哇</div>
</div>
<div id="showT">
    <c:forEach items="${title}" var="show">
        ${show.title}
        ${show.information}
        ${show.company}
        ${show.companyid}
        ${show.money}<br>
    </c:forEach>
</div>
<div><input class="one" placeholder="请点击或输入搜索字段..." onclick="showRange()" oninput="range(this.value)"
            onporpertychange="range(this.value)" onchange="range(this.value)"></div>
<div class="First hidden">
    <div class="o">0000-0000</div>
    <div class="o">2000-3000</div>
    <div class="o">3000-4000</div>
    <div class="o">4000-5000</div>
    <div class="o">5000-6000</div>
    <div class="o">2000-6000</div>
</div>
<c:forEach items="${money}" var="show">
    ${show.title}
    ${show.information}
    ${show.company}
    ${show.money}<br/>
</c:forEach>
</body>
</html>
