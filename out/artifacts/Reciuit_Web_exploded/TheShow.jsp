<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/18
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        html,body{
            margin:0;
            height:100%;
            Background-size:cover;

        }
        #head{
            position: fixed;
            top: 0;
            width: 100%;
            height: 40px;
            background-color: #4d4d4f;
            z-index: 1;
        }
        .headTow{
            width: 100%;
            height: 120px;
            background-image: linear-gradient(#759bda, #abc3e3,white);
            opacity: 80%;
            position: fixed;
            top: 40px;
            z-index: 1;
        }
        .show{
            width: 350px;
            position: relative;
            top: -4px;
            left: 220px;
            z-index: 1;
            color: orange;
            filter: drop-shadow(40px 40px yellow)
        }
        .logo{
            width: 200px;
            position: relative;
            top: -10px;
            left: 200px;
            z-index: 1;
            opacity: 100%;
        }
        #shows{
            height: 20px;
            position: fixed;
            top: -37px;
            left: -90px;
            z-index: 1;
            background-color: #4d4d4f;
        }

        .searchOne{
            border-radius: 10px;
            position: fixed;
            left: 38%;
            top: 80px;
            height: 41px;
            width: 400px;
            font-size: 20px;
            color: #0a0a0a;
            z-index: 1;
            border-color: #ebf5eb;
            opacity: 50%;

        }
        .searchSm{
            position: fixed;
            width: 60px;
            height: 41px;
            top: 80px;
            left: 1100px;
            z-index: 1;
            border: none;
            background-color: #9cb4e3;
            color: #dbdbe5;
            font-size: 20px;
            border-radius: 0 10px 10px 0;
        }
        #formOne{
            position: relative;
        }
        #pictureDiv>div{
            height:600px;
        }
        #con>div{
            width: 20px;
            height: 3px;
            margin-left:10px ;
            text-align: center;
            border: 2px solid darkgray;
            background-color: darkgray;
        }
        .login{
            position: fixed;
            width: 300px;
            height: 100px;
            left: 1100px;
            z-index: 2;
        }
        b{
            width: 200px;
            position: relative;
            top: -60px;
            left: 190px;
        }
        .userHead{
            position: relative;
            top: 20px;
            left: 200px;
            width: 150px;
        }
        .ID{
            position: relative;
            top: 10px;
            left: 150px;
        }
        .showAll{
            position: relative;
            top:200px;
            left: 250px;
            width: 1500px;
            height: 100px;
            font-size: 20px;
        }
        .themoney{
            float: left;
        }
        select{
            font-size: 20px;
        }
        input{
            font-size: 20px;
        }
    </style>
</head>
<body>
<script type="text/javascript" src="JS/jquery-3.6.0.js"></script>
<script type="text/javascript" src="JS/TT.js"></script>
<div class="login"><a href="ShowUI.jsp"><img src="Img/用户头像透明.png" class="userHead" alt="用户头像" title="${LoginU.uname}"></a><b>用户名:${LoginU.uname}<br><b class="ID">ID:${LoginU.uid}</b></b></div>
<div id="head"></div>
<div id="shows"><img src="Img/宣传语.png" class="show"></div>
<div class="headTow"><img src="Img/logo透明.png" class="logo"></div>
<form action="" method="post" id="formOne">
    <input type="text" class="searchOne" name="搜索"  placeholder="请输入您查询的工作或公司">
    <input type="submit" class="searchSm" value="搜索">
</form>
<div class="showAll">
<form method="post" action="TitleTest" class="themoney">
    标签<select name="title">
    <option value="">请选择</option>
    <option value="c加加">c++</option>
    <option value="爪哇">java</option>
</select>
    <input value="查询" type="submit">
</form>
<form method="post" action="ShowMoneyServlet" class="themoney">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    薪资<select name="money">
    <option value="0">请选择</option>
    <option value="3000">3000以下</option>
    <option value="4000">4000以下</option>
    <option value="5000">5000以下</option>
    <option value="6000">6000以下</option>
</select>
    <input value="查询" type="submit">
</form>
<form method="post" action="MoneyTitleServlet" class="themoney">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
<form method="post" action="RangeServlet" class="themoney">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
</div>
</body>
</html>
