<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/15
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chat UI</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="author" content="https://blog.csdn.net/q475254344">
    <link href="./chat.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
          crossorigin="anonymous">
    <script src="JS/jquery-3.6.0.js"></script>
    <style type="text/css">
        body {
            padding: 0px;
            margin: 0px;
        }
        li {
            list-style: none;
        }
        input {
            border-radius: 5px;
        }
        .leftbar ul {
            padding: 0px;
        }
        .leftbar li {
            padding: 10px;
        }
        .leftbar {
            background-color: #212e3e;
            width: 50px;
            height: 100%;
            color:grey;
            padding: 0px;
            text-align: center;
            position: absolute;
        }
        .container {
            height: 100%;
            width: 100%;
            background:  linear-gradient(#1f94bf 20%,#edf5f8 0, #edf5f8 80%, #1f94bf 0);
            display: flex;
            margin: 0;
        }
        .chatbox {
            margin: auto;
            height: 70%;
            width: 70%;
            transform: translateY(-10%);
            box-shadow: 0 0 0 1px gray;
            display: flex;
        }
        .chatleft {
            background-color: #ffffff;
            width: 25%;
            left: 0;
            height: 100%;
        }
        .chatleft .top {
            height: 10%;
            color: grey;
            background-color: #F7F9F9;
            display: flex;
            align-items: center;
            padding-left: 20px;
        }
        .searchbtn {
            height: 36px;
            width: 36px;
            border-radius: 18px;
            background-color: #1f94bf;
            color: #ECF0F1;
            margin-left: 10px;
        }
        .searchbtn:hover {
            cursor: pointer;
        }
        .chatleft #message {
            overflow-y: scroll;
            height: 90%;
        }
        .chatleft #message ul{
            padding-left: 10px;
        }
        .chatleft #message li{
            margin: 10px;
        }
        .chatright {
            background-color: #ffffff;
            width: 75%;
            height: 100%;
        }
        .chatright .top {
            height: 10%;
            display: flex;
            align-items: center;
            padding-left: 30px;
        }
        .chatright #message {
            background-color: #edf5f8;
            height: 65%;
            overflow-y: auto;
        }
        .chatright #message ul {
            padding: 10px;
        }
        .chatright #message li {
            margin: 10px;
            width: 100%;
        }
        .chatright #message p{
            display: inline-block;
        }
        .msgcard ,#mmm{
            margin: 0 10px 0 10px;
            background-color: white;
            border-radius: 10px;
            padding: 10px;
            max-width: 60%;
        }
        .msgleft {
            float: left;
        }
        .msgright {
            /* float: right; */
        }
        .chatright .footer {
            height: 25%;
            background-color: #FBFCFC;
            text-align: right;
        }
        .sendbtn {
            height: 40px;
            width: 80px;
            border-radius: 10px;
            background-color: #58D68D;
            color: white;
            font-weight: bold;
            margin:10px 20px 0 0;
        }
    </style>
</head>
<script>
    document.getElementsByTagName('body').height=window.innerHeight;
</script>
<body class="box">
<div class="leftbar">
    <ul>
        <li><i class="fas fa-user"></i></li>
        <li><i class="fas fa-users"></i></li>
        <li><i class="fas fa-smile"></i></li>
        <li><i class="fas fa-envelope"></i></li>
        <li><i class="fas fa-bell"></i></li>
        <li><i class="fas fa-calendar-alt"></i></li>
        <li><i class="fas fa-power-off"></i></li>
    </ul>
</div>
<div class="container">
    <div class="chatbox">
        <div class="chatleft">
            <div class="top">
                <i class="fas fa-bars" style="font-size: 1.4em"></i>
                <input type="text" placeholder="search" style="width: 140px; height: 36px; margin-left: 25px;">
                <button class="searchbtn"></style><i class="fas fa-search"></i></button>
            </div>
            <div class="center">
                <ul>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;" src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                    <li>
                        <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                        <span style="margin-left: 10px;">Barack Obama</span>
                    </li>
                </ul>
            </div>
        </div>
        <div class="chatright">
            <div class="top">
                <img style="border-radius: 20px; vertical-align: middle;"  src="Img/搜索框21px.png">
                <span style="margin-left: 20px;">Barack Obama</span>
                <i class="fas fa-ellipsis-v" style="font-size: 1.4em; position: absolute; right: 20px; color: gray;"></i>
            </div>
            <div id="message">
                <ul>
                    <li class="msgleft">
                        <img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">
                        <p class="msgcard">This message on the left!</p>
                    </li>
                    <li class="msgright">
                        <img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">
                        <p class="msgcard">This message on the right!</p>
                    </li>
                    <li class="msgleft">
                        <img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">
                        <p class="msgcard">This is a long message! This is a long message! This is a long left message!</p>
                    </li>
                    <li class="msgright">
                        <img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">
                        <p class="msgcard">This message on the right!</p>
                    </li>
                    <li class="msgleft">
                        <img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">
                        <p class="msgcard">This is a long message! This is a long message! This is a long left message!</p>
                    </li>
                </ul>
                <ul id="mess">
                <li class="msgleft">
                    <img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">
                    <p id="mmm">This is a long message! This is a long message! This is a long left message!</p>
                </li>
                </ul>
            </div>
            <div class="footer">
                <textarea  id="text" maxlength="800" rows="5" cols="40" style="width: 100%; resize: none; border: none; " placeholder="请在此输入要发送的内容..."></textarea>
                <button class="sendbtn" onclick="send()">发送</button>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    //判断当前浏览器是否支持WebSocket
    if('WebSocket' in window){
        websocket = new WebSocket("ws://82.157.123.54:9010/ajaxchattest");
        console.log("link success");
    }else{
        alert('Not support websocket')
    }

    //连接发生错误的回调方法
    websocket.onerror = function(){
        setMessageInnerHTML("error");
    };

    //连接成功建立的回调方法
    websocket.onopen = function(event){
        // setMessageInnerHTML("open");
    }
    console.log("-----")
    //接收到消息的回调方法
    websocket.onmessage = function(event){
        setMessageInnerHTML(event.data);
    }

    //连接关闭的回调方法
    websocket.onclose = function(){
        setMessageInnerHTML("close");
    }

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function(){
        websocket.close();
    }

    //将消息显示在网页上
    function setMessageInnerHTML(innerHTML){
        // document.getElementById('mmm').innerHTML += innerHTML + '<br/>';
        $("#message").append(
            '<ul>'+
                '<li class="msgleft">'+
                '<img style="border-radius: 20px; vertical-align: top;"  src="Img/搜索框21px.png">'+
                    '<p id="mmm">'+innerHTML+'</p>'+
                '</li>'+
            '</ul>'
        );
        add();
    }

    //关闭连接
    function closeWebSocket(){
        websocket.close();
    }

    //发送消息
    function send(){
        var message = document.getElementById('text').value;
        websocket.send(message);
        $("#text").val("").focus();
    }
    function add()
    {
        var div = document.getElementById('message');
        div.scrollTop = div.scrollHeight;
    }
</script>
</body>
</html>