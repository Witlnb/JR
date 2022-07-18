<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/18
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            height: 35px;
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
            left: 1125px;
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
        #login{
            position: relative;
            top: -23px;
            left: 80%;
        }
        #register{
            position: relative;
            top: -46px;
            left: 76.7%;
        }
        #Talk{
            position: absolute;
            top: 10000px;
            left: 500px;
        }
        #d1{
            display: flex;
            position: relative;
            width: 1920px;
            height: 600px;
            top: 200px;
            left:0;
        }

        #pictureDiv{
            display: flex;
            position: absolute;
        }
        #pictureDiv>div{
            width: 1920px;
            height:600px;
        }
        #OWindow{
            margin: 0 auto;
            width: 1920px;
            height: 600px;
            position: relative;
            overflow: hidden;

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
            width: 50px;
            height: 43px;
            position: fixed;
            top: 0;
            left: 1509px;
            color: #f5eded;
            background-color: #88acce;
            border:none;
            z-index: 1;
        }
        .inset{
            width: 50px;
            height: 43px;
            position: fixed;
            top:0;
            left: 1559px;
            color: #e9e9f1;
            background-color: #88acce;
            border:none;
            z-index: 1;
        }
        .sj{
            position: relative;
            top: 210px;
            left: 880px;
            height: 100px;

        }
        .video{
            position: relative;
            top: 270px;
            width: 100%;
        }
        #chooseBoss{
            width: 50%;
            height: 1069px;
            background-color: #18181c;
            position: absolute;
            top: 975px;
            left: 0;
            opacity: 10%;
            z-index: 1;
        }
        #chooseUser{
            width: 50%;
            height: 1069px;
            background-color: #100b0b;
            position: absolute;
            left:50%;
            top: 975px;
            opacity: 10%;
            z-index: 1;
        }
        .User{
            position: absolute;
            top: 975px;
            left: 0;
            width: 50%;
            height: 1069px;
            background-image: url("Img/球.gif");
            background-position: -900px -100px;
            font-size:35px;
            color: #ebf5eb;
            display: none;
        }
        .Boss{
            position: absolute;
            left: 50%;
            top: 975px;
            width: 50%;
            height: 1069px;
            background-image: url("Img/球2.gif");
            background-position: -900px -100px;
            font-size:35px;
            color: #edf6f4;
            display: none;
        }
        #loginPage{
            position: absolute;
            top: 200px;
            left: 40%;
            background-image: url("Img/星空.gif");
            width: 350px;
            height: 400px;
            z-index: 10;
            border-radius: 50px;
            color: #ebf5eb;
        }
        #upbody{
            position: absolute;
            top: -399px;
            left: 0;
            width: 1920px;
            height: 1500px;
            z-index: 4;
            background-color: #bdbbbb;
            opacity: 50%;
        }
        .name{
            position: relative;
            top:90px;
            left: 60px;
        }
        .pwd{
            position: relative;
            top:130px;
            left: 60px;
        }
        .loginU{
            position: relative;
            top: 180px;
            left: 60px;
            width: 230px;
            height: 100px;
            border-radius: 10px;
            font-size: 40px;
            background-image: url("Img/小王子.jpg");
            background-position: center;
            color: #cad8f3;
        }
        #LoginP{
            display:none;
        }
    </style>
</head>
<body>
<script type="text/javascript" src="JS/jquery-3.6.0.js"></script>
<script type="text/javascript" src="JS/TT.js"></script>
<div id="head"></div>
<div id="shows"><img src="Img/宣传语.png" class="show"></div>
<div class="headTow"><img src="Img/logo透明.png" class="logo"></div>
<form action="" method="post" id="formOne">
    <input type="text" class="searchOne" name="搜索"  placeholder="请输入您查询的工作或公司">
    <input type="submit" class="searchSm" value="搜索">
</form>
<input  class="login" type="button" name="login" value="登录" onclick="login()">
<form action="Enroll.jsp" method="post" id="register">
    <input  class="inset" type="submit" name="register" value="注册">
</form>
<!--<div id="Talk">-->
<!--    <a href="Talk.jsp">在线沟通</a>-->
<!--</div>-->
<div  id ="d1">
    <div id="OWindow">
        <div id="pictureDiv" >
            <div style="background-image: url(Img/背景5.jpg);" class="picture"></div>
            <div style="background-image: url(Img/背景1.jpg);" class="picture"></div>
            <div style="background-image: url(Img/背景2.jpg);" class="picture"></div>
            <div style="background-image: url(Img/背景3.jpg);" class="picture"></div>
            <div style="background-image: url(Img/背景5.jpg);" class="picture"></div>
        </div>
    </div>
</div>
<img src="Img/倒三角.png" class="sj">
<video class="video" muted="muted"  loop="loop" src="https://lf-cdn-tos.bytescm.com/obj/static/toutiao/resource/ailabweb/media/home.ccc6b169.mp4" autoplay="autoplay"></video>
<a href="Enroll.jsp?type=1"><div id="chooseBoss"></div></a>
<div><input  class="Boss" type="button" name="Boss" value="我要招聘"></div>
<a href="Enroll.jsp?type=2"><div id="chooseUser"></div></a>
<div><input class="User" type="submit" name="User" value="我要求职"></div>
<div id="LoginP">
    <div id="upbody"></div>
    <form action="HrServlet" method="post" id="loginPage">
        <div class="name"> 手机号:&nbsp;<input type="text" name="phone">
            <br/>
        </div>
        <div class="pwd"> 密&emsp;码:&nbsp;<input type="password" name="cpwd"><br/></div>
        <input type="submit" value="登录" class="loginU">
    </form>
</div>
<script>
    login = function() {
        $("#LoginP").css("display","block");
        $("body").css("overflow-y"," hidden")
    }
</script>
</body>
</html>
